// How can you display images in GUI using Java? ----------
/*
Answer:
Images can be displayed in Java GUI using Swing components such as ImageIcon, JLabel, and by overriding paintComponent() method of JPanel.
The ImageIcon class is used to load images from file. A JLabel can display the image by passing the ImageIcon object to it.
For advanced graphics, the paintComponent(Graphics g) method is overridden and the image is drawn using g.drawImage() method.
*/

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\Anjan\\source\\Advanced Java\\Exam Question no. 1\\src\\pointer.png");

//        for scaling ----------
//        Image img = icon.getImage();
//        Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
//        ImageIcon scaledIcon = new ImageIcon(scaledImg);

        JLabel label = new JLabel(icon);

        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.add(label);

    }
}

