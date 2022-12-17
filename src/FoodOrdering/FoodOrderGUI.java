package FoodOrdering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderingSystem() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orders();
            }
        });
    }

    public void foodOrder() {
        try {
            boolean ctr = false;
            double temp = 0;
            double ans = 0;

            if (cPizza.isSelected()) {
                temp += 100;
                ctr = true;
            }
            if (cBurger.isSelected()) {
                temp += 80;
                ctr = true;
            }
            if (cFries.isSelected()) {
                temp += 65;
                ctr = true;
            }
            if (cSoftDrinks.isSelected()) {
                temp += 55;
                ctr = true;
            }
            if (cTea.isSelected()) {
                temp += 50;
                ctr = true;
            }
            if (cSundae.isSelected()) {
                temp += 40;
                ctr = true;
            }

            if (rbNone.isSelected()) {
                temp = temp;
                ctr = true;
            }
            if (rb5.isSelected()) {
                ans = temp * 0.05;
                temp = temp - ans;
                ctr = true;
            }
            if (rb10.isSelected()) {
                ans = temp * 0.10;
                temp = temp - ans;
                ctr = true;
            }
            if (rb15.isSelected()) {
                ans = temp * 0.15;
                temp = temp - ans;
                ctr = true;
            }

            if (ctr == false) {
                throw new Exception("Invalid");
            }
            JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%2f", temp));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        FoodOrderingSystem ch = new FoodOrderingSystem();
        ch.setContentPane(ch.panel1);
        ch.setSize(600, 500);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ch.setVisible(true);
        ch.setTitle("Food Ordering System");
    }
}
