package database;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Database {


        /* modélisation en singleton pour la connexion à la base de donnée
        *  la base de donnée est en private afin de ne pas permettre de nouveau objet en déhors de cette classe
        *  */


        private static Connection connection;

        private Database() throws IOException, SQLException {

               InputStream env = new FileInputStream(".env");
               Properties properties = new Properties();
               properties.load(env);

               String URL = properties.getProperty("DB_URL");
               String USER = properties.getProperty("DB_USER");
               String PASSWORD = properties.getProperty("DB_PASSWORD");

               connection = DriverManager.getConnection(URL, USER, PASSWORD);

        }

        public static Connection getConnection() throws SQLException, IOException {
                if (connection == null || connection.isClosed()){
                        new Database();
                }
                return connection;
        }

}
