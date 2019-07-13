package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Calculator extends JPanel {

	private static final long serialVersionUID = -1340732273401597053L;
	private Screen screen;
	private NumberPanel numberPanel;
	private List <Integer> numbersList;
	public static boolean paintScreen = false;
	
	public Calculator(int width, int height) {
		numbersList = new ArrayList<Integer>();
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

	public List <Integer> getNumbersList() {
		return this.numbersList;
	}

	public void addToNumbersList(int number) {
		this.numbersList.add(number);
		this.repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(paintScreen) {
			//numberPanel.repaint();
		}
		paintScreen = true;
	}
}
