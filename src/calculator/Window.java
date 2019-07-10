package calculator;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = -8898253768994115313L;
	private Activity mainActivity = new Activity();
	
	public Window(int width, int height) {
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(mainActivity);
		this.setVisible(true);
	}
	
}
