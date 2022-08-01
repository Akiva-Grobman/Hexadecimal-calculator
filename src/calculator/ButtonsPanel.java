package calculator;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{

	private Calculator calculator;
	
	public ButtonsPanel(Calculator calculator) {
		this.calculator = calculator;

		this.setLayout(new GridLayout(6,4));

		for (String entry : Definitions.buttonsPanelOrder) {
			this.add(createButton(entry));					
		}

	}

	private JButton createButton(String buttonValue) {

		JButton button = new JButton();

		if (buttonValue.equals("AC")) 
			button.setBackground(Color.ORANGE);
		else 
			button.setBackground(Color.LIGHT_GRAY);

		button.setText(buttonValue);

		button.addActionListener( e -> {

			String value = button.getText();

			if(calculator.getEquation().contains(Definitions.stringOfSymbols) && value.contains(Definitions.stringOfSymbols)) {
				new ToastMessage(this, "Can not use multiple symbols");
				return;
			}
		
			if(value.equals("AC")) {
				calculator.clearEquation();
				return;
			}

			calculator.updateEquation(button.getText());
		});
	
		return button;
	}
}
