package database;
import java.sql.*;

public class Database {
        private static final String URL = "jdbc:mysql://localhost:3306/donjon";
        private static final String USER = "root";
        private static final String PASSWORD = "donjon";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

}
