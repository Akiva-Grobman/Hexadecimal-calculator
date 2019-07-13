package calculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class NumberButton extends JButton{

	private static final long serialVersionUID = -5825753833125096648L;
	private int value;
	
	public NumberButton(int value, Color color, Calculator calculator) {
		this.setBackground(color);
		setBorder(BorderFactory.createLineBorder(Color.red));
		if(value > 9) {
			this.setText((char)((value + ('A' - 10))) + "");
		} else {
			this.setText(value + "");
		}
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.addToNumbersList(value);
			}
		});
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
