package org.example.io;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 08:32 PM
 * 30-09-2022
 */

public class DBConnect {


    /**
     *
     * @param username
     * @param password
     */
    public static void connectMySQL(String username,String password) throws SQLException {
        String url="jdbc:mysql://localhost:3306/cognizant";

        Connection connection=DriverManager.getConnection(url, username,password);
        //method 1
        String query="show tables";

        Statement statement=connection.createStatement();      //creating statement
        ResultSet resultSet=statement.executeQuery(query);   //executing statement

        if (connection!=null){
            System.out.println("connected");
            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
        }

        //method 2
        Properties properties=new Properties();
        properties.put("user","root");
        properties.put("password","hope");

        Connection connection2=DriverManager.getConnection(url,properties);

        System.out.println("*************************************");

        System.out.println("connected by method 2");

        Statement statement2=connection2.createStatement();      //creating statement
        ResultSet resultSet2=statement2.executeQuery(query);

        while(resultSet2.next()){
            System.out.println(resultSet2.getString(1));
        }


    }

    /**
     *
     * @param username
     * @param password
     */
    public static void connectOracleXE(String username,String password) throws ClassNotFoundException, SQLException {
//        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        Connection connection=DriverManager.getConnection(url,username,password);
        String query="select * from tab";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(query);
        while (resultSet.next())
            System.out.println(resultSet.getString(1));


    }

    public static void main(String[] args) throws Exception {
        String username="root";
        String password="hope";
        connectMySQL(username,password);

        String user="c##rudra";
        String passwd="rudra";
        connectOracleXE(user,passwd);

    }
}
