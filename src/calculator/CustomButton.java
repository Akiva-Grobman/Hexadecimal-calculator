package calculator;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CustomButton extends JButton {

	private static final long serialVersionUID = -8201592288999968234L;
	private BUTTON_TYPE buttonType;
	private Calculator calculator;
	
	public enum BUTTON_TYPE {
		plus,
		minus,
		multiply,
		clear
	}
	
	public CustomButton(BUTTON_TYPE buttonType, Calculator calculator) {
		this.buttonType = buttonType;
		this.calculator = calculator;
		setText();
		this.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(buttonType == BUTTON_TYPE.clear) {
					calculator.getNumbersList().clear();
					calculator.repaint();
				}
			}
		});
	}
	
	private void setText() {
		String text = "";
		switch(this.buttonType) {
		case plus: {
			text = " + ";
		}
		case minus: {
			text = " - ";
		}
		case multiply: {
			text = " X ";
		}
		case clear: {
			text = " AC ";
		}
	}
	this.setText(text);
	}

	public BUTTON_TYPE getButtonType() {
		return this.buttonType;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
}
