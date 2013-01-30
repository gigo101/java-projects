/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnection {
    
    public static Connection dbconnect(){
        
    Connection conn= null;
    
     try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            
                
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
     
     return conn;
        
     
    
    }
    
    
    
}
