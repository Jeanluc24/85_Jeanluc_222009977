  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.xemacscode.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class DBConnection {
    
  
    public static Connection connectDB(){
       
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","admin", "Musengayezu");
            return conn;
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("There were errors while connecting to db.");
            return null;
        }
    }
    
}
