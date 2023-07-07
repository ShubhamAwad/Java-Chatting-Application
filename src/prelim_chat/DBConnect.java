/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelim_chat;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {
    Connection conn;
    public static Connection DBConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testDB","root","Saa@341999");
            return conn;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
            
    }
}
