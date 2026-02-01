import javax.swing.*; import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    JButton newBtn, loginBtn, logoutBtn;
    JToolBar toolbar;

    public App() {
        setTitle("Toolbar Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         setLayout(new BorderLayout());

        toolbar = new JToolBar();

        newBtn = new JButton("New");         loginBtn = new JButton("Login");
        logoutBtn = new JButton("Logout");

        newBtn.addActionListener(this);         loginBtn.addActionListener(this); logoutBtn.addActionListener(this);
        toolbar.add(newBtn);        toolbar.add(loginBtn);        toolbar.add(logoutBtn);
        add(toolbar, BorderLayout.NORTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newBtn) {
            JOptionPane.showMessageDialog(this, "New File Created");
        } else if(e.getSource() == loginBtn) {
            JOptionPane.showMessageDialog(this, "Login Successful");
        } else if(e.getSource() == logoutBtn) {
            JOptionPane.showMessageDialog(this, "Logged Out");
        }
    }

    public static void main(String[] args) {         new App();
    } } 
