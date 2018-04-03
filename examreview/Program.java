
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Program extends JFrame {

    private JRadioButton jrb1, jrb2;
    private ButtonGroup bg1;
    private String[] titles = {"Show Integer Result", "Show Floating-Point Result",};
    private JComboBox jcbo = new JComboBox(titles);
    private JTextField jtfNum, jtfResult;
    private JButton jbt;
    private int val1 = 0;
    private double val2 = 0;

    public Program() {
        jcbo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (jcbo.getSelectedIndex() == 0) {
                    jtfResult.setText(String.valueOf(val1));
                } else {
                    jtfResult.setText(String.valueOf(val2));
                }
            }
        });
        add(jcbo, BorderLayout.NORTH);
        JPanel p1 = new JPanel(new GridLayout(2, 1));
        jrb1 = new JRadioButton("half");
        jrb2 = new JRadioButton("third");
        p1.add(jrb1);
        p1.add(jrb2);
        bg1 = new ButtonGroup();
        bg1.add(jrb1);
        bg1.add(jrb2);
        CalListener dl = new CalListener();
        jrb1.addActionListener(dl);
        jrb2.addActionListener(dl);
        add(p1, BorderLayout.WEST);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1));
        jtfNum = new JTextField(3);
        jtfResult = new JTextField(3);
        p2.add(jtfNum);
        p2.add(jtfResult);
        add(p2, BorderLayout.CENTER);
        jbt = new JButton("Clear");
        jbt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtfNum.setText("");
                jtfResult.setText("");
            }
        });
        add(jbt, BorderLayout.SOUTH);

    }

    class CalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int num = Integer.parseInt(jtfNum.getText());
            if (e.getSource() == jrb1) {
                val1 = num / 2;
                val2 = (double) num / 2;
            } else {
                val1 = num / 3;
                val2 = (double) num / 3;
            }
            jtfResult.setText(String.valueOf(val1));
        }

    }

    public static void main(String[] args) {
        Program a = new Program();
        a.setSize(300, 300);
        a.setVisible(true);
    }
}
