package postgresql;

import java.sql.*;

public class JDBCPosgreSQLConexiune {

    private final String url        = "jdbc:postgresql://localhost/policlinicadb";
    private final String user       = "policlinica_user";
    private final String password   = "policlinica_password";

    public void conectare(){

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conectat la baza de date");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
            if(resultSet.next())
                System.out.println(resultSet.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
