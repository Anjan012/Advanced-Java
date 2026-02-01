import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/swastik_db?useSSL=false",
                    "root",
                    "root"
            );

            String updatesql = "UPDATE student SET Salary = Salary + (Salary * 0.15) WHERE Salary < 20000";
            PreparedStatement ps = con.prepareStatement(updatesql);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record(s) updated successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}