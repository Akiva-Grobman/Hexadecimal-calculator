package calculator;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CustomButton extends JButton {

	private static final long serialVersionUID = -8201592288999968234L;
	private BUTTON_TYPE buttonType;
	
	public enum BUTTON_TYPE {
		plus,
		minus,
		multiply,
		divide,
		power,
		root,
		equals,
		number,
		clear
	}
	
	public CustomButton(BUTTON_TYPE buttonType, Calculator calculator) {
		this.buttonType = buttonType;
		setText();
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.setHexs();
				calculator.setPreviousButton(calculator.getAction());
				System.out.println(calculator.getAction());
				calculator.setAction(buttonType);
				calculator.setPaintResolute(true);
				calculator.repaint();
			}
		});
	}
	
	private void setText() {
		String text = "";
		switch(this.buttonType) {
		case plus: {
			text = " + ";
			break;
		}
		case minus: {
			text = " - ";
			break;
		}
		case multiply: {
			text = " X ";
			break;
		}
		case clear: {
			text = " AC ";
			break;
		}
		case divide: {
			text = " / ";
			break;
		}
		case power: {
			text = " ^ ";
			break;
		}
		case root: {
			text = " √ ";
			break;
		}
		case equals: {
			text = " = ";
			break;
		}
	}
	this.setText(text);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
}
