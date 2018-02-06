package javaapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveMessageDemo extends JFrame {
  public MoveMessageDemo() {
    
    MovableMessagePanel p = new MovableMessagePanel("Welcome to Java");
    add(p);
  }

 public static void main(String[] args) {
    MoveMessageDemo frame = new MoveMessageDemo();
    frame.setTitle("MoveMessageDemo");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setVisible(true);
  }
 // Inner class: MovableMessagePanel draws a message
  static class MovableMessagePanel extends JPanel {
    private String message = "Welcome to Java";
    private int x = 20;
    private int y = 20;

    public MovableMessagePanel(String s) {
      message = s;
      addMouseMotionListener(new MouseMotionListener() {
        /** Handle mouse dragged event */
        public void mouseDragged(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            repaint();
        }
       public void mouseMoved(MouseEvent e) {
       }
      });
    }


 protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString(message, x, y);
    }
  }
}
