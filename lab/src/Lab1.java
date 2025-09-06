import javax.swing.*;
import java.awt.event.*;

public class Lab1 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Sum and Difference");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(50, 50, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(160, 50, 150, 30);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(50, 100, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(160, 100, 150, 30);

        JLabel result = new JLabel("Result will appear here");
        result.setBounds(50, 150, 250, 30);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(result);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    result.setText("Sum: " + (num1 + num2));
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers!");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    result.setText("Difference: " + (num1 - num2));
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers!");
                }
            }
        });

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
