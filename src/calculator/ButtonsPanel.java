package calculator;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{

	private Calculator calculator;
	
	public ButtonsPanel(Calculator calculator) {
		this.calculator = calculator;

		this.setLayout(new GridLayout(6,6));

		for (Object entry : Definitions.buttonType) {

			if (entry instanceof String)
				this.add(createButton((String) entry));
			
			else if (entry instanceof List) {

				while (!((List<?>) entry).isEmpty()) {
					String value = (String) ((List<?>) entry).get(0);
					((List<?>) entry).remove(0);
					this.add(createButton(value));
				}		
			}				
		}

	}

	private JButton createButton(String buttonValue) {

		JButton button = new JButton();

		button.setBackground(Color.LIGHT_GRAY);
		button.setOpaque(false);
		button.setText(buttonValue);

		// TODO: for clean and other symbols make unique method 

		button.addActionListener( e -> {

			String value = button.getText();

			if(value.equals("AC")) {
				calculator.clearEquation();
				return;
			}

			
			switch(value.charAt(0)) {

			}

			calculator.updateEquation(button.getText());
		});
	
		return button;
	}
}
