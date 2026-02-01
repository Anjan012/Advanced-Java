import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App extends JFrame implements ItemListener {
    JRadioButton redBtn, greenBtn, blueBtn;
    ButtonGroup bg;
    public App() {
        setTitle("Color Changer");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        redBtn = new JRadioButton("Red");
        greenBtn = new JRadioButton("Green");
        blueBtn = new JRadioButton("Blue");
        redBtn.addItemListener(this);
        greenBtn.addItemListener(this);
        blueBtn.addItemListener(this);
        bg = new ButtonGroup();
        bg.add(redBtn);
        bg.add(greenBtn);
        bg.add(blueBtn);
        add(redBtn);
        add(greenBtn);
        add(blueBtn);
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (redBtn.isSelected()) {
            getContentPane().setBackground(Color.RED);
        } else if (greenBtn.isSelected()) {
            getContentPane().setBackground(Color.GREEN);
        } else if (blueBtn.isSelected()) {
            getContentPane().setBackground(Color.BLUE);
        }
    }
    public static void main(String[] args) {
        new App();
    }
}