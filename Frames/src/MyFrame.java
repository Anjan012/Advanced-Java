import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {
    // creating a constructer for my frame
    MyFrame() {
        // JFrame = a GUI window to add components to
        this.setVisible(true); // make frame visible
        this.setSize(800, 600); // sets the x and the y dimensions of the frame
        this.setTitle("JFrame Title goes here"); // sets title of frame
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE)); // this will close the window and terminate the process by default it is HIDE_ON_CLOSE
        this.setResizable(false); // prevent frame from being resized

        // setting the logo
        ImageIcon image = new ImageIcon("logo.png"); // create an image icon
        this.setIconImage(image.getImage()); // Change icon of frame

        // changing the background colour
//        this.getContentPane().setBackground(Color.green); // Change colour of background
        this.getContentPane().setBackground(new Color(0,0,255)); // Change colour of background
//        this.getContentPane().setBackground(new Color(0x123456)); // Change colour of background
    }

}
