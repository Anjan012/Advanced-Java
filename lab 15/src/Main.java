import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastik_db?useSSL=false",
                    "root", "root");
            String sql="create table tblStudent(id INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(50),email VARCHAR(50));";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            String insertSql="insert into tblStudent(name,email) values(?,?)";
            PreparedStatement ips= con.prepareStatement(insertSql);
            ips.setString(1, "shreya");
            ips.setString(2, "shreya@gmail.com");
            ips.executeUpdate();
            con.close();
            System.out.println("Updated successfully");
        } catch(Exception e){
            System.out.println(e.getMessage());
        } } }