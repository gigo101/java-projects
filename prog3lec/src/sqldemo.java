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
import java.sql.Statement;
import javax.swing.JOptionPane;

public class sqldemo {
    
    public static void main(String[] args){
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        String sql=null;
        
        conn=javaconnect.ConnecrDb();
        
        try {
            sql="Select * from userlogin";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){     
                        System.out.println(rs.getString("username") +", "+ rs.getString("password"));
            }
            
        } catch (Exception e) {
            
        }
    
    
    }
    
}
