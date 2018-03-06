package javaapplication2;

import java.awt.Graphics;
import javax.swing.JPanel;

class NewPanel extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0, 0, 50, 50);
        g.drawString("Hello World", 0, 40);
    }
}
