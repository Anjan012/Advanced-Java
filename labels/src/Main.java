import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {

        // JLabel = a GUI area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("garfield.png");

        JLabel label = new JLabel(); // create a label
        label.setText("Hello World"); // set text of label
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

        frame.add(label); // without our layout manager it is using borderlayout its likes to take string, images and center LHS


    }
}