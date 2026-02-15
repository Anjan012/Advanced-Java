import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        // JPanel - a GUI component that functions as a container to hold other components
        // panel use flow layout

        JLabel redLabel = new JLabel();
        redLabel.setText("Hello from red label");
        redLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel blueLabel = new JLabel();
        blueLabel.setText("Hello from blue label");
        blueLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel greenLabel = new JLabel();
        greenLabel.setText("Hello from green label");
        greenLabel.setHorizontalAlignment(JLabel.CENTER);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        // since we are not using any layout manager we have to manually place the width and the height
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setLayout(null);
        redPanel.add(redLabel);
        bluePanel.add(blueLabel);
        greenPanel.add(greenLabel);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
