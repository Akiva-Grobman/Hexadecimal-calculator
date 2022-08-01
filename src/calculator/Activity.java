package calculator;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Activity extends JPanel {
	
	public Activity(int width, int height) {

		Calculator calculator = new Calculator(width, height);
		
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 10));
		this.setBackground(Color.GRAY);
		this.add(calculator);
	}
	
}
