package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

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
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font font = new Font("arial", 2, 35);
		g.setFont(font);
		// TODO handle errors (preferably not here)
		try {
			String resolute = calculator.getHex().toString();
			g.drawString(resolute, this.getWidth() - (resolute.length() * 17), 70);
		} catch(NullPointerException e) {}
	}
}
