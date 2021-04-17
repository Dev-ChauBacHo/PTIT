package CSDLPT;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = new DAO().getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Users");
             while (rs.next()) {
                 System.out.println(rs.getInt(1) +
                         rs.getString(2) +
                         rs.getString(3));
             }
             conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Statement statement;
    }
}
