package javaapplication;

import java.awt.*;
import java.awt.event.*;

public class AwtAdapterDemo {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtAdapterDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtAdapterDemo  awtAdapterDemo = new AwtAdapterDemo();  
      awtAdapterDemo.showMouseAdapterDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showMouseAdapterDemo(){
      headerLabel.setText("Listener in action: MouseAdapter");      

      Panel panel = new Panel();      
      panel.setBackground(Color.red);
      panel.setLayout(new FlowLayout());        
      panel.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e) {
            statusLabel.setText("Mouse Clicked: ("
            +e.getX()+", "+e.getY() +")");
         }                
      });

      Label msglabel = new Label();
      msglabel.setAlignment(Label.CENTER);
      msglabel.setText("Click in this box.            :)");

      msglabel.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e) {
            statusLabel.setText("Mouse Clicked: ("
            +e.getX()+", "+e.getY() +")");
         }                
      });
      panel.add(msglabel);
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
}
