package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import calculator.CustomButton.BUTTON_TYPE;

public class Calculator extends JPanel {

	private static final long serialVersionUID = -1340732273401597053L;
	private Screen screen;
	private NumberPanel numberPanel;
	private Hex hex1 = null, hex2 = null;
	private String numberString = "";
	private BUTTON_TYPE actionType = null;
	
	public Calculator(int width, int height) {
		screen = new Screen(width - (width / 100 * 20), height - (height / 100 * 95), this);
		numberPanel = new NumberPanel(this);
		this.setBackground(Color.cyan);
		setBorder(BorderFactory.createLineBorder(Color.red));
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.add(screen, BorderLayout.NORTH);
		this.add(numberPanel, BorderLayout.CENTER);
	}

	public void setHexs() {
		setHex();
		if(hex1 == null) {
			hex1 = new Hex("0");
		}
		if(hex2 != null) {
			calculate();
		}
	}
	
	private void calculate() {
		switch(actionType) {
			case clear: {
				hex1 = null;
				hex2 = null;
				break;
			}
			case divide: {
				hex1 = hex1.divide(hex2);
				break;
			}
			case equals: {
				//hex1.equals(hex2): TODO add this function
				break;
			}
			case minus: {
				hex1 = hex1.substract(hex2);
				break;
			}
			case multiply: {
				hex1 = hex1.multiply(hex2);
				break;
			}
			case plus: {
				hex1 = hex1.add(hex2);
				break;
			}
			case power: {
				hex1 = hex1.power(hex2);
				break;
			}
			case root: {
				hex1 = hex1.root(hex2);
				break;
			}
		}
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		screen.repaint();
	}

	public String getNumberString() {
		return numberString;
	}

	public Hex getHex() {
		return this.hex1;
	}
	
	public void setNumberString(String numberString) {
		this.numberString = numberString;
	}

	public void setHex() {
		if(hex1 == null) {
			hex1 = new Hex(this.numberString);
		} else {
			hex2 = new Hex(this.numberString);
		}
		this.numberString = "";
	}

	public void setAction(BUTTON_TYPE buttonType) {
		this.actionType = buttonType;
	}
	
}

