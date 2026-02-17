import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

// if you want you button to perform some action you have to implement an action listener interface
public class MyFrame extends JFrame implements ActionListener{

    // declaring button in global
    JButton button;
    JLabel label;

    // constructer
    MyFrame() {

        ImageIcon image = new ImageIcon("C:\\Users\\Anjan\\source\\Advanced Java\\Swing part 3\\src\\pointer.png");

        label = new JLabel(image);
        label.setBounds(250, 250, 500, 500);
        label.setIcon(image);
        label.setVisible(false);

        button = new JButton("I am Button");
        button.setBounds(100, 100, 500, 300); // my icon is too large so i make the size of button big
        button.setFocusable(false); // removes the round area of the button that is around the buttons
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        // disable the button
        // button.setEnabled(false);

        button.addActionListener(this);
        // we can also do this in shortcut using the lamda expression which is more advanced remove the implements ActionListener and below function ad do this instead
       // button.addActionListener(e -> System.out.println("Button clicked"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            // System.out.println("Button clicked");
            label.setVisible(true);
        }
    }
}
