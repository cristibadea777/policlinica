package main.java.postgresql;

import java.sql.*;

public class JDBCPosgreSQLConexiune {

    private final String url        = "jdbc:postgresql://localhost/policlinicadb";
    private final String user       = "policlinica_user";
    private final String password   = "policlinica_password";

    public Connection getConexiune(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
