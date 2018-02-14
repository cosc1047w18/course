package javaapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame implements ActionListener {
    private double[] a;
    private JRadioButton divideByZeroButton;
    
    private JRadioButton badCastButton;
    
    private JRadioButton arrayBoundsButton;
    
    private JRadioButton nullPointerButton;
    
    
    
    private JRadioButton throwMyButton;
    
    public Main() {
        
        // Create a JPanel and GridLayout
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(8, 1));
        
        // Create buttons and add them to the panel
        ButtonGroup g = new ButtonGroup();
        divideByZeroButton = addRadioButton("Divide by zero", g, p);
        badCastButton = addRadioButton("Bad cast", g, p);
        arrayBoundsButton = addRadioButton("Array bounds", g, p);
        nullPointerButton = addRadioButton("Null pointer", g, p);
        throwMyButton = addRadioButton("Throw My own Exception", g, p);
        getContentPane().add(p);
    }
    
    private JRadioButton addRadioButton(String s, ButtonGroup g, JPanel p) {
        JRadioButton button = new JRadioButton(s, false);
        button.addActionListener(this);
        g.add(button);
        p.add(button);
        return button;
    }
    
    // Trigger and catch various exceptions
    public void actionPerformed(ActionEvent evt) {
        try {
            Object source = evt.getSource();
            if (source == divideByZeroButton) {
               // cause divideByZero exception
               
            } else if (source == badCastButton) {
                // cause a bad cast exception
                
            } else if (source == arrayBoundsButton) {
                //cause an array out of bounds exception
                
            } else if (source == nullPointerButton) {
                //cause a null pointer exception
                
                
            } else if (source == throwMyButton) {
                //create your own custom exception and throw it, and handle it
            }
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setSize(200, 200);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
