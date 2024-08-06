/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tour;

 

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");                             // register the drive class
            c =DriverManager.getConnection("jdbc:mysql:///tms","root","Suj@y935974"); // creating connection string  
            
            s =c.createStatement();                                           //creating the statement
            
           
        }catch(Exception e){                                                  //execute queries
        	                                                                  // close connection
            System.out.println(e);
        }  
    }  
}