package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import calculator.CustomButton.BUTTON_TYPE;
import javafx.scene.chart.BubbleChart;

public class Calculator extends JPanel {

	private static final long serialVersionUID = -1340732273401597053L;
	private Screen screen;
	private NumberPanel numberPanel;
	//private Hex hex;
	private String hexString;
	private BUTTON_TYPE actionType;
	private int oldNumber;
	
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

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	public String getHex() {
		return this.hexString;
	}

	public void setHex(String hex) {
		this.hexString = hex;
	}

	public int getOldNumber() {
		return oldNumber;
	}

	public void setOldNumber(int oldNumber) {
		this.oldNumber = oldNumber;
	}

	public BUTTON_TYPE getAction() {
		return this.actionType;
	}
	
	public void setAction(BUTTON_TYPE buttonType) {
		this.actionType = buttonType;
	}
	
}

