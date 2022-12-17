package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  SimpleCalculator extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void action Performed(ActionEvent e) {
                opConputer();
            }
        });
    }

    public void OpCompute() {
        try {
            String op = (String) cbOperations.getSelectedItem();
            double a = Double.parseDouble(tfNumber1.getText());
            double b = Double.parseDouble(tfNumber2.getText());
            double res = 0;

            if (op == "+") {
                res = a + b;
                lblResult.setText(String.valueOf(String.format("%.0f", (res))));
            }
            if (op == "-"){
                res = a - b;
                lblResult.setText(String.valueOf(String.format("%.0f", (res))));
            }
            if (op == "*"){
                res = a * b;
                lblResult.setText(String.valueOf(String.format("%.0f", (res))));
            }
            if (op == "/"){
                res = a / b;
                lblResult.setText(String.valueOf(String.format("%.0f", (res))));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args) {
        SimpleCalculator ch = new SimpleCalculator();
        ch.setContentPane(ch.panel1);
        ch.setSize(600, 300);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ch.setVisible(true);
        ch.setTitle("Simple Calculator");
    }
}
