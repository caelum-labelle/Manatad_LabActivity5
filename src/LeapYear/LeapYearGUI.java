package LeapYear;

import javax.swing.*;
import java.awt.ent.ActionEvent;
import java.awt.ent.ActionListener;

public class LeapYearChecker extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkYear();
            }
        });
    }

    public void checkyear() {
        try {
            if (tfYear.getText() ==" ") {
                throw new IllegalArgumentException("Empty String!");
            }
            double year = Double.parseDouble(tfYear.getText());
            boolean leap;

            if (year < 0) {
                throw new IllegalArgumentException("Input is invalid!");
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if(year % 400 == 0) {
                        leap = true;
                    } else {
                        leap = false;
                    }
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

        } catch (IllegalArgumentExcepton e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            tfYear.setText("");
        }
    }

    public static void main(String[] args) {
        LeapYearChecker ch = new LeapYearChecker();
        ch.setContentPane(ch.panel1);
        ch.setSize(350, 350);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ch.setVisible(true);
        ch.setTitle("Leap Year Checker");
    }
}

