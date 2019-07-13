package calculator;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import calculator.CustomButton.BUTTON_TYPE;

public class NumberPanel extends JPanel{

	private static final long serialVersionUID = -975044179834822381L;

	private NumberButton tempNumber;
	private CustomButton clearButton;
	
	public NumberPanel(Calculator calculator) {
		int count = 0;
		clearButton = new CustomButton(BUTTON_TYPE.clear, calculator);
		setBorder(BorderFactory.createLineBorder(Color.red));
		this.setLayout(new GridLayout(6,6));
		for(int i = 0; i < 36; i++) {
			if(i >= 6 && i < 30 && (i % 6 != 0 && (i - 5) % 6 != 0)) {
				if(count <= 9) {
					tempNumber = new NumberButton(count, Color.cyan, calculator);
				} else {
					tempNumber = new NumberButton(count + ('A' - 10), Color.cyan, calculator);
				}
				this.add(tempNumber);
				count++;
			} else if (i < 34){
				this.add(new JLabel());
			} else {
				this.add(clearButton);
			}
		}
	}
}
