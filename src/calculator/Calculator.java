package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Calculator extends JPanel {

	private ResultScreen resultScreen;
	private ButtonsPanel buttonsPanel;
	private String equation = "";
	
	public Calculator(int width, int height) {

		resultScreen = new ResultScreen(width - (width / 100 * 20), height - (height / 100 * 95), this);
		
		buttonsPanel = new ButtonsPanel(this);
		this.setBackground(Color.cyan);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.add(resultScreen, BorderLayout.NORTH);
		this.add(buttonsPanel, BorderLayout.CENTER);
	}

	public void updateEquation(String digit) {
		equation += digit;
		resultScreen.repaint();
	}

	public void clearEquation() {
		equation = "";
		resultScreen.repaint();
	}

	public void setEquation(String equation) {
		this.equation = equation;
	}

	public String getEquation() {
		return equation;
	}

    public String calculate() {

		equation = equation.substring(0, equation.length() - 1);

		char symbol = '+';

			if( equation.contains("+")) symbol = '+';
		else 
			if( equation.contains("-")) symbol = '-';
		else 
			if( equation.contains("*")) symbol = '*';
		else 
			if( equation.contains("/")) symbol = '/';
		else 
			if( equation.contains("√")) symbol = '√';
		else 
			if( equation.contains("^")) symbol = '^';
		else 
			return String.valueOf(convertHexToDec(equation));
			
		List<String> dividedEquation = Arrays.asList(equation.split(String.valueOf("\\" + symbol)));

		long d1 = convertHexToDec((String) dividedEquation.get(0));
		long d2 = convertHexToDec((String) dividedEquation.get(1));

		long solution = 0;

		switch (symbol) {
			case '+':
				solution = add(d1, d2);
			break;
			case '-':
				solution = subtract(d1, d2);
			break;
			case '/':
				solution = divide(d1, d2);
			break;
			case '^':
				solution = power(d1, d2);
			break;
			case '*':
				solution = multiply(d1, d2);
			break;
			case '√':
				solution = root(d1, d2);
			break;
		}

		equation = convertDecToHex(solution);
        return equation;
    }

	public long multiply(long d1, long d2) {
		return d1 * d2;
	}

	public long divide(long d1, long d2) {
		return d1 / d2;
	}

	public long add(long d1, long d2) {
		return d1 + d2;
	}

	public long subtract(long d1, long d2) {
		return d1 - d2;
	}

	public long power(long d1, long d2) {
		return (long) Math.pow(d1, d2);
	}

	public long root(long d1, long d2) {
		return(int) Math.sqrt(d1);
	}

	private int convertHexToDec(String hex) {
		return Integer.parseInt(hex, Definitions.HEXADECIMAL);
	}

	private String convertDecToHex(long dec) {
		return Long.toHexString(dec);
	}

}

