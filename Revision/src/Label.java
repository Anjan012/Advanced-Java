import javax.swing.JFrame; // We have to import javax.swing
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;

public class Label {
    public static void main(String[] args) {

        // JFrame : It is a standalone, independent window that can be moved, resized, minimized, maximized,
        // and closed by the user.

        // Creating a new frame
        JFrame frame = new JFrame();
        frame.setVisible(true); // for the visibility we have to set it true default it is set to false so we are not
        // able to see the window
        frame.setSize(400, 400); // setting the size (x IMdimension and y dimension)
        frame.setTitle("GUI Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
        ImageIcon image = new ImageIcon("src/logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.RED);

        JLabel label = new JLabel();
        label.setText("Hello World");
        frame.add(label); // It's using borderlayout so it likes to take strings or images to the center on the left side


//        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN); // Changing the font color

    }
}