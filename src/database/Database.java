package database;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Database {


        public static Connection getConnection() throws SQLException, IOException {

                // InputStream env = ClassLoader.getSystemClassLoader().getResourceAsStream(".env");
                InputStream env = new FileInputStream(".env");
                Properties properties = new Properties();

                properties.load(env);

                String URL = properties.getProperty("DB_URL");
                String USER = properties.getProperty("DB_USER");
                String PASSWORD = properties.getProperty("DB_PASSWORD");


                return DriverManager.getConnection(URL, USER, PASSWORD);
        }



}
