package FoodOrdering;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox pizzaCheckBox;
    private JRadioButton noneRadioButton;
    private JButton orderButton;

    public static void main(String[] args) {
        FoodOrderGUI ch = new FoodOrderGUI();
        ch.setContentPane(ch.panel1);
        ch.setSize(600, 500);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ch.setVisible(true);
        ch.setTitle("Food Ordering System");
    }
}