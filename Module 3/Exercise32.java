// 32. Insert and Update Operations in JDBC
// Requires MySQL JDBC driver
import java.sql.*;

public class Exercise32 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
            ps.setInt(1, 1);
            ps.setString(2, "Lokesh");
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}