import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CustomerForm extends JFrame implements ActionListener {

    JTextField txtCid, txtName, txtAddress, txtEmail, txtAge;
    JButton btnInsert;

    // constructer
    public CustomerForm() {

        setTitle("Customer Form");
        setLayout(new GridLayout(6, 2));   // Using Layout Manager

        // Labels
        add(new JLabel("Customer ID:"));
        txtCid = new JTextField();
        add(txtCid);

        add(new JLabel("Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Address:"));
        txtAddress = new JTextField();
        add(txtAddress);

        add(new JLabel("Email:"));
        txtEmail = new JTextField();
        add(txtEmail);

        add(new JLabel("Age:"));
        txtAge = new JTextField();
        add(txtAge);

        btnInsert = new JButton("Insert");
        add(btnInsert);

        btnInsert.addActionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            // Get values
            int cid = Integer.parseInt(txtCid.getText());
            String name = txtName.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            int age = Integer.parseInt(txtAge.getText());

            // Database Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Shop",
                    "root",
                    "password"
            );

            String query = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, cid);
            pst.setString(2, name);
            pst.setString(3, address);
            pst.setString(4, email);
            pst.setInt(5, age);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Customer Inserted Successfully!");

            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CustomerForm();
    }
}
