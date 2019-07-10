package calculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class Activity extends JPanel {

	private static final long serialVersionUID = -5845639586115510743L;
	private Calculator calculator;
	
	public Activity(int width, int height) {
		calculator = new Calculator(width, height);
		this.setBackground(Color.black);
		this.setLayout(new GridBagLayout());
		this.add(calculator);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
}
