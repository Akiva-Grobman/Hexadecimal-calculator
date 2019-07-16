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
	private String hex;
	
	public NumberButton(int value, Color color, Calculator calculator) {
		// sets the graphics
		this.setBackground(color);
		this.value = value;
		setBorder(BorderFactory.createLineBorder(Color.black));
		// sets the button value(0-9,A-F)
		if(value > 9) {
			this.setText((char)(value) + "");
		} else {
			this.setText(value + "");
		}
		// adds the button listener
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(value <= 9) {
					calculator.setNumberString(calculator.getNumberString() + value);
				} else {
					calculator.setNumberString(calculator.getNumberString() + ((char)value));
				}
				
			}
		});
	}

	public int getValue() {
		return value;
	}

	public String getHex() {
		return this.hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
