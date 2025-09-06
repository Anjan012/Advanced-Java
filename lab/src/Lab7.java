import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab7 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator with BorderLayout");

        f.setLayout(new BorderLayout(10, 10));

        JPanel northPanel = new JPanel();
        JLabel titleLabel = new JLabel("Simple Calculator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        northPanel.add(titleLabel);
        f.add(northPanel, BorderLayout.NORTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(4, 1, 5, 5));

        JButton b1 = new JButton("Info", resizeIcon("info.png", 20, 20));
        JButton b2 = new JButton("Help", resizeIcon("help.png", 20, 20));
        JButton b3 = new JButton("Settings", resizeIcon("setting.png", 20, 20));
        JButton b4 = new JButton("Exit", resizeIcon("exit.png", 20, 20));

        eastPanel.add(b1);
        eastPanel.add(b2);
        eastPanel.add(b3);
        eastPanel.add(b4);
        f.add(eastPanel, BorderLayout.EAST);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel l1 = new JLabel("First Number:");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("Second Number:");
        JTextField t2 = new JTextField();
        JLabel l3 = new JLabel("Result:");
        JTextField result = new JTextField();
        result.setEditable(false);

        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");
        JButton mulBtn = new JButton("Multiply");
        JButton divBtn = new JButton("Divide");

        centerPanel.add(l1); centerPanel.add(t1);
        centerPanel.add(l2); centerPanel.add(t2);
        centerPanel.add(l3); centerPanel.add(result);
        centerPanel.add(addBtn); centerPanel.add(subBtn);

        JPanel bottomBtns = new JPanel();
        bottomBtns.setLayout(new GridLayout(1, 2, 5, 5));
        bottomBtns.add(mulBtn); bottomBtns.add(divBtn);

        f.add(centerPanel, BorderLayout.CENTER);
        f.add(bottomBtns, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> calculate(t1, t2, result, "Add"));
        subBtn.addActionListener(e -> calculate(t1, t2, result, "Subtract"));
        mulBtn.addActionListener(e -> calculate(t1, t2, result, "Multiply"));
        divBtn.addActionListener(e -> calculate(t1, t2, result, "Divide"));
        b4.addActionListener(e -> System.exit(0));

        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    private static ImageIcon resizeIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    private static void calculate(JTextField t1, JTextField t2, JTextField result, String op) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double res = 0;

            switch (op) {
                case "Add": res = num1 + num2; break;
                case "Subtract": res = num1 - num2; break;
                case "Multiply": res = num1 * num2; break;
                case "Divide":
                    if (num2 != 0) res = num1 / num2;
                    else {
                        result.setText("Cannot divide by zero");
                        return;
                    }
                    break;
            }
            result.setText(String.valueOf(res));
        } catch (NumberFormatException e) {
            result.setText("Invalid Input!");
        }
    }
}
