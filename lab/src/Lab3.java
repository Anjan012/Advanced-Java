import javax.swing.*;
import java.awt.event.*;

public class Lab3 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(50, 50, 100, 30);
        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(50, 100, 100, 30);
        JLabel l3 = new JLabel("Result:");
        l3.setBounds(50, 200, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 50, 150, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(160, 100, 150, 30);
        JTextField result = new JTextField();
        result.setBounds(160, 200, 150, 30);
        result.setEditable(false);

        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};
        JComboBox<String> opBox = new JComboBox<>(operations);
        opBox.setBounds(160, 150, 150, 30);

        JButton b = new JButton("Calculate");
        b.setBounds(160, 250, 120, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(t1.getText());
                    double num2 = Double.parseDouble(t2.getText());
                    String op = (String) opBox.getSelectedItem();
                    double res = 0;

                    switch(op) {
                        case "Add":
                            res = num1 + num2;
                            break;
                        case "Subtract":
                            res = num1 - num2;
                            break;
                        case "Multiply":
                            res = num1 * num2;
                            break;
                        case "Divide":
                            if (num2 != 0) {
                                res = num1 / num2;
                            } else {
                                result.setText("Cannot divide by zero");
                                return;
                            }
                            break;
                    }
                    result.setText(String.valueOf(res));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid Input!");
                }
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(result);
        f.add(opBox); f.add(b);

        f.setSize(400, 350);
        f.setLayout(null);
        f.setVisible(true);
    }
}
