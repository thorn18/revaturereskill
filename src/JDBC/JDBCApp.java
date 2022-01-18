package src.JDBC;
import java.sql.*;

public class JDBCApp {

    public static void main(String[] args) {
        String url = "Mysqsl://localhost:3306/";
        String dbname = "newschema";
        String username = "root";
        String password = "268442abc";
        final String QUERY = "SELECT id, first, last, age FROM Employees";


        // Open a connection
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
