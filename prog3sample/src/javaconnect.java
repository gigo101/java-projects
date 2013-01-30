 
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class javaconnect {
    
    static Connection conn=null;
    public static Connection ConnecrDb(){
    
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            //JOptionPane.showMessageDialog(null, "Connection established");
            return conn;
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        
        }
    }
    
}
