package calculator;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = -4564733439519587860L;
	private Activity mainActivity;
	
	public Window(int width, int height) {
		mainActivity = new Activity((width / 100) * 40, height - (height/ 100 * 20));
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(mainActivity);
		this.setVisible(true);
	}
	
}
