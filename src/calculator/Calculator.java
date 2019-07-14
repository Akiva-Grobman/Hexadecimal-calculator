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
		setHex(numberString);
		if(actionType != null) {
			
		}
	}
	
	private void calculate() {
		switch(actionType) {
		
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	public String getNumberString() {
		return numberString;
	}

	public void setNumberString(String numberString) {
		this.numberString = numberString;
	}

	public void setHex(String hex) {
		if(hex1 == null) {
			hex1 = new Hex(hex);
		} else {
			hex2 = new Hex(hex);
		}
	}

	public void setAction(BUTTON_TYPE buttonType) {
		this.actionType = buttonType;
	}
	
}

