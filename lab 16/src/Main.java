import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/swastik_db?useSSL=false",
                    "root",
                    "root"
            );

            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = stmt.executeQuery("SELECT * FROM emp ORDER BY id");

            // First Record
            rs.first();
            System.out.println("First Record:");
            System.out.println("Id: " + rs.getInt("id") +
                    " Name: " + rs.getString("name") +
                    " Department: " + rs.getString("dept"));

            // Last Record
            rs.last();
            System.out.println("\nLast Record:");
            System.out.println("Id: " + rs.getInt("id") +
                    " Name: " + rs.getString("name") +
                    " Department: " + rs.getString("dept"));

            // Previous Record
            rs.previous();
            System.out.println("\nPrevious Record:");
            System.out.println("Id: " + rs.getInt("id") +
                    " Name: " + rs.getString("name") +
                    " Department: " + rs.getString("dept"));

            // Next Record
            rs.next();
            System.out.println("\nNext Record:");
            System.out.println("Id: " + rs.getInt("id") +
                    " Name: " + rs.getString("name") +
                    " Department: " + rs.getString("dept"));

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}