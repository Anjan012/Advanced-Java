import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {

        // ===== FRAME =====
        JFrame frame = new JFrame("Simple Dashboard");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // ===== RED PANEL (Profile) =====
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 300, 250);
        redPanel.setLayout(new BorderLayout());

        JLabel redLabel = new JLabel("Profile Section");
        redLabel.setHorizontalAlignment(JLabel.CENTER);
        redPanel.add(redLabel, BorderLayout.CENTER);

        // ===== BLUE PANEL (Notifications) =====
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(300, 0, 300, 250);
        bluePanel.setLayout(new BorderLayout());

        JLabel blueLabel = new JLabel("Notifications");
        blueLabel.setHorizontalAlignment(JLabel.CENTER);
        bluePanel.add(blueLabel, BorderLayout.CENTER);

        // ===== GREEN PANEL (Main Content) =====
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 600, 300);
        greenPanel.setLayout(new BorderLayout());

        JLabel greenLabel = new JLabel("Main Content Area");
        greenLabel.setHorizontalAlignment(JLabel.CENTER);
        greenPanel.add(greenLabel, BorderLayout.CENTER);

        // ===== ADD TO FRAME =====
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
}
