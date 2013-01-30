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

//connect and retrieve data from database using CreateStatement
public class simplesql2 {

    public static void main(String[] args){
        
        Connection conn=null;
        Statement st=null;
        String sql=null;
        ResultSet rs=null;
            
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            
            sql="select * from userlogin";
            st=conn.createStatement();
            
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                        
                System.out.println(rs.getString("username") +", " + rs.getString("password"));
            
            }
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
       
    }
    }
