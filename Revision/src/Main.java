import javax.swing.*; // We have to import javax.swing

public class Main {
    public static void main(String[] args) {

        // JFrame : It is a standalone, independent window that can be moved, resized, minimized, maximized, and closed by the user.

        // Creating a new frame
        JFrame frame = new JFrame();
        frame.setVisible(true); // for the visibility we have to set it true default it is set to false so we are not able to see the window
        frame.setSize(400, 400); // setting the size (x dimension and y dimension)
        frame.setTitle("GUI Interface");


    }
}