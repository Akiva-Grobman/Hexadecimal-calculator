package calculator;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Screen extends JPanel {

	private static final long serialVersionUID = 2673592926732783675L;

	public Screen(int width, int height) {
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
	}
	
}
