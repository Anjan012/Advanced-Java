import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    Image img;

    public ImagePanel() {
        img = new ImageIcon("C:\\Users\\Anjan\\source\\Advanced Java\\Exam Question no. 1\\src\\pointer.png").getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 50, 50, this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Drawing Example");
        frame.add(new ImagePanel());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
