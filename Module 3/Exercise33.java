// 33. Transaction Handling in JDBC
import java.sql.*;

public class Exercise33 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");

            conn.commit();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}