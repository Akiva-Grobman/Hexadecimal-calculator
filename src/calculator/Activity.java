package calculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Activity extends JPanel {

	private static final long serialVersionUID = -5845639586115510743L;
	private Calculator calculator;
	private BufferedImage K300;
	
	public Activity(int width, int height) {
		calculator = new Calculator(width, height);
		this.setBackground(Color.black);
		this.setLayout(new GridBagLayout());
		this.add(calculator);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			K300 = ImageIO.read(new File(this.getClass().getResource("background.png").getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//g.drawImage(K300, 20, 0, this);
	}
	
}
