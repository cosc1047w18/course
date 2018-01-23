import javax.swing.*;
import java.awt.*;

public class PizzaMenu extends JFrame {

	public PizzaMenu() {
		setLayout(new BorderLayout()); //sets the layout, only one layout is needed per dialog box, you will be adding to this later
		
		JPanel sizePanel = new JPanel(); //Creates a new panel for the "size" where all of the size buttons will live
		sizePanel.setLayout(new GridLayout(3, 1)); //sets the layout inside of the size panel
		sizePanel.setBorder(BorderFactory.createTitledBorder("Size")); // Gives the panel a titled border
		JRadioButton sizeJRB1 = new JRadioButton("Small"); //adds a button option with the description "small"
		JRadioButton sizeJRB2 = new JRadioButton("Medium"); //adds a button option with the description "medium"
		JRadioButton sizeJRB3 = new JRadioButton("Large"); //adds a button option with the description "Large"
		sizePanel.add(sizeJRB1); //adds the button to the panel
		sizePanel.add(sizeJRB2); //adds the button to the panel
		sizePanel.add(sizeJRB3); //adds the button to the panel
		ButtonGroup bgSize = new ButtonGroup(); //creates a group for the buttons to live so they know they interact with eachother
		bgSize.add(sizeJRB1); //adds the buttons to the group
		bgSize.add(sizeJRB2);
		bgSize.add(sizeJRB3);
		add(sizePanel, BorderLayout.CENTER); adds the size panel to the Border Layout
	

	}
	
	public static void main(String[] args) {
		
		PizzaMenu pizza = new PizzaMenu();
		pizza.setTitle("Pizza Menu");
		pizza.setSize(350, 200);
		pizza.setLocationRelativeTo(null);
		pizza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pizza.setVisible(true);
	}
	
}
