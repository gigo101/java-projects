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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class createDatabase {
    
    public static void main(String[] args){
                Connection conn=null;
        PreparedStatement pst=null;
        String sql=null;
        ResultSet rs=null;
            
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            
            sql="create table userlogoin (userid  int(5) not null primary key auto_increment, username varchar(30) not null, password varchar(30) not null, usertype varchar(6) not null)";
            pst=conn.prepareStatement(sql);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Database table sucessfully created!");   
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);   
        }
    }
    
}
