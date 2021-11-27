package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDatabase
{
    public static Connection getConnection(){
        Connection connect = null;
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","rahul123");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return connect;
    }
}
