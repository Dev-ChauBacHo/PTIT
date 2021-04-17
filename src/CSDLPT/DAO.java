package CSDLPT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class DAO {
    private final String USER_NAME = "sa";
    private final String PASSWORD = "Vinh1106";
    private final String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String dbUrl = "jdbc:sqlserver://localhost\\VINHTRAN:1433;" +
            "databaseName = caro";

    public DAO() {

    }

    public Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName(dbClass);
            conn = DriverManager.getConnection(dbUrl, USER_NAME, PASSWORD);
            Logger.getLogger("connect successfully");
        } catch (Exception e) {
            Logger.getLogger("connect failure");
            e.printStackTrace();
        }
        return conn;
    }
}
