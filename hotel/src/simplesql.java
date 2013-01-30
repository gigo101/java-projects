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

//connect and retrieve data from database using Prepared statement
public class simplesql {

    public static void main(String[] args){
        
        Connection conn=null;
        PreparedStatement pst=null;
        String sql=null;
        ResultSet rs=null;
        
        javaconnection.dbconnect();
       
       
    }
    }
