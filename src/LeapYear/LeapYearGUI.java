package LeapYear;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;

    public static void main(String[] args) {
        LeapYearGUI ch = new LeapYearGUI();
        ch.setContentPane(ch.panel1);
        ch.setSize(350, 350);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ch.setVisible(true);
        ch.setTitle("Leap Year Checker");
    }
}