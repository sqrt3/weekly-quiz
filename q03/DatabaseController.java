package weekly.q03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseController {
    private final String SQL = "SELECT * FROM students WHERE age BETWEEN 30 AND 39";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/test_db";
    private String username;
    private String password;

    public DatabaseController(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void getResult() {
        try (Connection conn = DriverManager.getConnection(DATABASE_URL, username, password)){
            try (Statement statement = conn.createStatement(); ResultSet rs = statement.executeQuery(SQL)) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String address = rs.getString("address");
                    System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
                }
            }

        } catch (SQLException e) {
            System.out.println("Except from getResult: " + e.getMessage());
        }
    }
}
