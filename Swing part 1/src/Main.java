import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Jlabel = a GUI display are for a string of text, an image or both

        ImageIcon image = new ImageIcon("C:\\Users\\Anjan\\source\\Advanced Java\\Swing part 1\\src\\sample.jpg");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Welcome to Swing part 1!");
        label.setIcon(image);
        // By default the label text will be put on the right (LEFT, CENTER, RIGHT of image icon)
        label.setHorizontalTextPosition(JLabel.CENTER); // overlaps on the image
//        label.setHorizontalTextPosition(JLabel.LEFT);

        // Font
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        // TOP, CENTER, BOTTOM
        label.setVerticalTextPosition(JLabel.BOTTOM);

        // you can set the gap of text and icon
        label.setIconTextGap(-25); // +ve or -ve

        // change Background Color
        label.setBackground(Color.black);
        label.setOpaque(true); // Display the bg color
        // note: label likes to take the as much space you can also limit it

        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER); // set Vertical position of content within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of content within label

//        label.setBounds(100, 100, 350, 350);

        JFrame frame = new JFrame("Swing part 1");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400,400);
        frame.add(label);
        // frame.setLayout(null);
        // use pack at the end after adding label
        frame.pack(); // The size of the frame will adjusted automatically to fit all of the components you have

    }
}
