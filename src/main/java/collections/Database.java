package collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Database(){

    }
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","postgresql");
        return connection;
    }
}
