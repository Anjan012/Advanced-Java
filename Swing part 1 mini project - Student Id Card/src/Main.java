import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

       // ImageIcon
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Anjan\\source\\Advanced Java\\Swing part 1 mini project - Student Id Card\\src\\profile.jpg");
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        Border border = BorderFactory.createLineBorder(Color.red, 3);

        JLabel title = new JLabel("Student Id Card");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.BLACK);
        title.setHorizontalTextPosition(JLabel.CENTER);

        // Image
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(resizedIcon);
        imageLabel.setBorder(border);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Details Label
        JLabel details = new JLabel("<html> Name: Anjan Khadka <br/> ID: 965312431 <br/> Course: BCA </html>");
        details.setFont(new Font("MV Boli", Font.PLAIN, 18));
        details.setForeground(Color.BLACK);
        details.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setTitle("Student Id Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.add(title, BorderLayout.NORTH);
        frame.add(imageLabel,  BorderLayout.CENTER);
        frame.add(details,  BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null); // center on screen
        frame.pack();
    }
}
