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
	
	public void paintComponent(Graphics g) throws NullPointerException {
		super.paintComponent(g);
		//g.drawString(calculator.getHex().toString(), this.getWidth() / 100 * 20, this.getHeight() / 100 * 50);
	}
	
}
