package collections;

import java.sql.*;

public class Database {
    private Database(){

    }
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres","postgresql");
        return connection;
    }
    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
    public static void closeStatement(Statement statement) throws SQLException {
        statement.close();
    }
    public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }
    public static void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }
}
