/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("Connection Fail" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/dbproject2";
        try{
            DBConnection = (Connection) DriverManager.getConnection(url, "root", "");
            System.out.println("DataBase Connected");
        }
        catch(SQLException se){
            System.out.println("No DataBase" + se);
        }
        return DBConnection;
         
        
    }
            
    
}

