package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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

	public String getEquation() {
		return equation;
	}

    public String calculate() {

		//convert to dec, calculate and turn back to hex.
		// switch by symbol
        return null;
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

}

