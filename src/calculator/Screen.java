package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Screen extends JPanel {

	private static final long serialVersionUID = 2673592926732783675L;
	private Calculator calculator;
	
	
	public Screen(int width, int height, Calculator calculator) {
		this.calculator = calculator;
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
	}

	public String getString() {
		String temp = calculator.getNumbersList() + "", numbersString = "";
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
				numbersString += temp.charAt(i) + " ";
			} else {
				numbersString += (char)temp.charAt(i) + " ";
			}
		}
		return numbersString;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(Calculator.paintScreen)
			//g.drawString(getString(), 20, 20);
	}
	
}
