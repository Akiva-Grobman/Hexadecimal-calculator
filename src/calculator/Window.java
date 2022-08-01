package calculator;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	public Window(int width, int height) {
		
		Activity mainActivity = new Activity((width / 100) * 40, height - (height / 100 * 20));

		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(mainActivity);
		this.setVisible(true);
		this.pack();
	}
	
}
