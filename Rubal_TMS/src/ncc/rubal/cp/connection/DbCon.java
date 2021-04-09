/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class DbCon {

    private final String host = "localhost";
    private final String userName = "root";
    private final String password = "";
    private final String dbName = "rubal_tms";
    private String URL;
    private Connection connection;
    private static Statement statement;
    private static final DbCon instance = new DbCon();

    public static DbCon getInstance() {
        return instance;
    }

    public void connect() throws ClassNotFoundException, SQLException {
        URL = "jdbc:mysql://" + host + ":3306/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(URL, userName, password);
        System.out.println("Connection Successful");
    }
 
    public int executeUpdate(String sql) throws SQLException {
      statement = connection.createStatement();
        return statement.executeUpdate(sql);

    }
    public ResultSet executeQuery(String sql) throws SQLException {
        
            statement = connection.createStatement();
            return statement.executeQuery(sql);

        }
    

    public void close() throws SQLException {
        connection.close();
    }


}
