package crud.sem.database.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDB {

    private static Connection connection;

    private SingletonDB() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = initConnection();
        }
        return connection;
    }

    private static Connection initConnection() {
        try {
            return DriverManager.getConnection("jdbc:sqlite::resource:produtos.db");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
