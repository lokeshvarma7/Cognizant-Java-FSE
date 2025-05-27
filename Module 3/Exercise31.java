// 31. Basic JDBC Connection
// Note: Requires MySQL JDBC driver (mysql-connector-java)
import java.sql.*;

public class Exercise31 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}