import javax.swing.*;
import java.awt.event.*;

public class Lab2 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Add Two Numbers");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(50, 50, 100, 30);
        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(50, 100, 100, 30);
        JLabel l3 = new JLabel("Result:");
        l3.setBounds(50, 150, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 50, 150, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(160, 100, 150, 30);
        JTextField result = new JTextField();
        result.setBounds(160, 150, 150, 30);
        result.setEditable(false);

        JButton b = new JButton("Add");
        b.setBounds(160, 200, 80, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int sum = num1 + num2;
                    result.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid Input!");
                }
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(result);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
