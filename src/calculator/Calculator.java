package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class Calculator extends JPanel {

	private static final long serialVersionUID = -1340732273401597053L;
	private Screen screen;
	
	public Calculator(int width, int height) {
		screen = new Screen(width - (width / 100 * 20), height - (height / 100 * 95));
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.add(screen);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
}
