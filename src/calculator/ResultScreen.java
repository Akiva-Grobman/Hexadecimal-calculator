package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ResultScreen extends JPanel {

	private Calculator calculator;
	
	public ResultScreen(int width, int height, Calculator calculator) {
		
		this.calculator = calculator;

		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(width, height));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Ubuntu", 0, 25));


		String text = calculator.getEquation();

		if (text.isEmpty())
			return;

		if(text.charAt(text.length() - 1) == '=') {	
			try {
				text = "0x" + calculator.calculate();
				calculator.setEquation("");
			} catch(NullPointerException e) {
				text = "Error : " + e.getMessage();
				calculator.setEquation("");
			}
			g.drawString(text, this.getWidth() - (text.length() * 15), 90);
		}else 
			g.drawString(text, this.getWidth() - (text.length() * 15), 90);
	}
}
