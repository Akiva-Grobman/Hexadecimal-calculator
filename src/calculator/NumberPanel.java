package calculator;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import calculator.CustomButton.BUTTON_TYPE;

public class NumberPanel extends JPanel{

	private static final long serialVersionUID = -975044179834822381L;

	private Calculator calculator;
	private NumberButton tempNumber;
	private CustomButton tempButton;
	
	public NumberPanel(Calculator calculator) {
		this.calculator = calculator;
		tempButton = new CustomButton(BUTTON_TYPE.clear, calculator);
		setBorder(BorderFactory.createLineBorder(Color.red));
		this.setLayout(new GridLayout(6,6));
		buttonSetter();
	}
	
	private void buttonSetter() {
		int count = 0;
		for(int i = 0; i < 36; i++) {
			if(i >= 6 && i < 30 && (i % 6 != 0 && (i - 5) % 6 != 0)) {
				if(count <= 9) {
					tempNumber = new NumberButton(count, Color.cyan, calculator);
				} else {
					tempNumber = new NumberButton(count + ('A' - 10), Color.cyan, calculator);
				}
				this.add(tempNumber);
				count++;
			} else if (i < 31){
				switch(i) {
					case 17: {
						this.add(new CustomButton(BUTTON_TYPE.plus, calculator));
						break;
					}
					case 23: {
						this.add(new CustomButton(BUTTON_TYPE.minus, calculator));
						break;
					}
					case 29: {
						this.add(new CustomButton(BUTTON_TYPE.multiply, calculator));
						break;
					}
					default : {
						this.add(new JLabel());
						break;
					}
				}
			} else {
				switch(i) {
					case 31: {
						tempButton = new CustomButton(BUTTON_TYPE.divide, calculator);
						break;
					}
					case 32: {
						tempButton = new CustomButton(BUTTON_TYPE.power, calculator);
						break;
					}
					case 33: {
						tempButton = new CustomButton(BUTTON_TYPE.root, calculator);
						break;
					}
					case 34: {
						tempButton = new CustomButton(BUTTON_TYPE.clear, calculator);
						break;
					}
					case 35: {
						tempButton = new CustomButton(BUTTON_TYPE.equals, calculator);
						break;
					}
				}
				this.add(tempButton);
			}
		}
	}
}
