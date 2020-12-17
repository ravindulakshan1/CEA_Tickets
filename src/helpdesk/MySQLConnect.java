package helpdesk;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravindu
 */
public class MySQLConnect { 
    
    Connection conn=null;
    public static Connection ConnectDB() throws ClassNotFoundException{
    
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/help_desk","root","");
           // conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("connected");
            return conn;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return null;
    }
   /* private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/help_desk";*/
}
