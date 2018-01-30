package javaapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlField extends JFrame{
      private JButton hello = new JButton("Set Hello");
      private JButton goodbye = new JButton("Set Goodbye");
      private JTextField field = new JTextField();

      public ControlField(){
            JPanel panel = new JPanel();
            panel.add(hello);
            panel.add(goodbye);

            this.add(field, BorderLayout.CENTER);
            this.add(panel, BorderLayout.SOUTH);

            hello.addActionListener(new HelloListener());
            goodbye.addActionListener(new GoodbyeListener());
      }

      public static void main(String[] args) {
            JFrame frame = new ControlField();
            frame.setTitle("Control text Field");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setVisible(true);
      }

      class HelloListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                  field.setText("Hello");
            }
      }

      class GoodbyeListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                  field.setText("GoodBye");
            }
      }
 
}
