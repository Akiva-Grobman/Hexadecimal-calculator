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
	private Hex hex1, hex2;
	private String numberString = "";
	private BUTTON_TYPE actionType = null, previousButton = null;
	private boolean hex1IsNotNull = false, paintResolute = false;
	
	public Calculator(int width, int height) {
		screen = new Screen(width - (width / 100 * 20), height - (height / 100 * 95), this);
		numberPanel = new NumberPanel(this);
		this.setBackground(Color.cyan);
		setBorder(BorderFactory.createLineBorder(Color.black));
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.add(screen, BorderLayout.NORTH);
		this.add(numberPanel, BorderLayout.CENTER);
	}

	public void setHexs() {
		setHex();
		if(hex2 != null) {
			calculate();
		}
	}
	
	private void calculate() {
		switch(actionType) {
			case clear: {
				hex1 = new Hex("");
				hex2 = new Hex("");
				this.repaint();
				break;
			}
			case divide: {
				try {
					hex1 = hex1.divide(hex2);
				} catch(ArithmeticException e) {
					hex1 = null;
				}
				hex2 = null;
				break;
			}
			case equals: {
				this.repaint();
				break;
			}
			case minus: {
				if(this.previousButton != BUTTON_TYPE.number && this.previousButton != BUTTON_TYPE.minus) {
					this.numberString = "-" + this.numberString;
				}
				hex1 = hex1.substract(hex2);
				hex2 = null;
				break;
			}
			case multiply: {
				hex1 = hex1.multiply(hex2);
				hex2 = null;
				break;
			}
			case plus: {
				hex1 = hex1.add(hex2);
				hex2 = null;
				break;
			}
			case power: {
				hex1 = hex1.power(hex2);
				hex2 = null;
				break;
			}
			case root: {
				hex1 = hex1.root(hex2);
				hex2 = null;
				break;
			}
		case number:
			break;
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
		Hex temp;
		if(paintResolute) {
			temp = this.hex1;
		} else {
			temp = new Hex(numberString);
		}
		return temp;
	}
	
	public void setNumberString(String numberString) {
		this.numberString = numberString;
	}

	public void setHex() {
		if(hex1 == null) {
			hex1 = new Hex(this.numberString);
			hex1IsNotNull = true;
		} else {
			hex2 = new Hex(this.numberString);
		}
		this.numberString = "";
	}

	public void setAction(BUTTON_TYPE buttonType) {
		this.actionType = buttonType;
	}
	
	public BUTTON_TYPE getAction() {
		return this.actionType;
	}

	public boolean isHex1IsNotNull() {
		return this.hex1IsNotNull;
	}
	
	public void setPaintResolute(boolean paintResolute) {
		this.paintResolute = paintResolute;
	}


	public BUTTON_TYPE getPreviousButton() {
		return this.previousButton;
	}

	
	public void setPreviousButton(BUTTON_TYPE previousButton) {
		this.previousButton = previousButton;
	}

}

