package LeapYear;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkYear();
            }
        });
    }

    public void checkYear() {
        try {
            if (tfYear.getText() == " ") {
                throw new IllegalArgumentException("Empty String!");
            }
            double yr = Double.parseDouble(tfYear.getText());
            boolean leap;

            if (yr < 0) {
                throw new IllegalArgumentException("Input is invalid!");
            }
            if (yr % 4 == 0) {
                if (yr % 100 == 0) {
                    leap = yr % 400 == 0;
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }

            if (leap) {
                JOptionPane.showMessageDialog(panel1, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
            }
            tfYear.setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            tfYear.setText("");}
    }

    public static void main(String[] args) {
        LeapYearGUI ch = new LeapYearGUI();
        ch.setContentPane(ch.panel1);
        ch.setSize(350, 350);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ch.setVisible(true);
        ch.setTitle("Leap Year Checker");
    }
}