import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JPanel redPanel;
    JPanel yellowPanel;
    JPanel greenPanel;

    // defining a constructer
    MyFrame() {

        redPanel=new JPanel();
        redPanel.setBounds(0,0,100,100);
        redPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        redPanel.setBackground(Color.red);

        yellowPanel=new JPanel();
        yellowPanel.setBounds(120,0,100,100);
        yellowPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        yellowPanel.setBackground(Color.gray);

        greenPanel=new JPanel();
        greenPanel.setBounds(240,0,100,100);
        greenPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        greenPanel.setBackground(Color.gray);

        button=new JButton("Change Color");
        button.setBounds(150,150,100,100);
        button.setBackground(Color.gray);
        button.setForeground(Color.white);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);
        button.addActionListener(this);

        this.setTitle("Traffic Light Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);
        this.setLayout(null);
        this.add(redPanel);
        this.add(yellowPanel);
        this.add(greenPanel);
        this.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            if(redPanel.getBackground()==Color.red){
                yellowPanel.setBackground(Color.yellow);
                redPanel.setBackground(Color.gray);
                greenPanel.setBackground(Color.gray);
            } else if(yellowPanel.getBackground()==Color.yellow){
                greenPanel.setBackground(Color.green);
                yellowPanel.setBackground(Color.gray);
                redPanel.setBackground(Color.gray);
            } else if(greenPanel.getBackground()==Color.green){
                redPanel.setBackground(Color.red);
                greenPanel.setBackground(Color.gray);
                yellowPanel.setBackground(Color.gray);
            } else {
                redPanel.setBackground(Color.red);
            }
        }
    }
}
