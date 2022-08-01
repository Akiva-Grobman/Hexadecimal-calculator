package calculator;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

public class ToastMessage extends JDialog {

   private static Boolean spamProtect = false;
    private final int milliseconds = 1500;

    public ToastMessage(JComponent caller, String toastString) {
        
        if(spamProtect) 
            return;
        
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setFocusableWindowState(false);
        this.setLayout(new GridBagLayout());

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        panel.setBackground(Color.LIGHT_GRAY);
        JLabel toastLabel = new JLabel(toastString);
        toastLabel.setForeground(Color.WHITE);
        panel.add(toastLabel);
        add(panel);
        pack();

        Window window = SwingUtilities.getWindowAncestor(caller);
        int xcoord = window.getLocationOnScreen().x + window.getWidth() / 2 - getWidth() / 2;
        int ycoord = window.getLocationOnScreen().y + (int)((double)window.getHeight() * 0.75) - getHeight() / 2;
        setLocation(xcoord, ycoord);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        setVisible(true);

        new Thread(){
            public void run() {
                try {
                    spamProtect = true;
                    Thread.sleep(milliseconds);
                    dispose();
                    spamProtect = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}