/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
import java.io.FileReader;
import java.io.FilterReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class textFileSample {
    
    public static void main(String[] args){
        
        String a="";
       
        try {
            
            FileReader f=new FileReader("/home/ppp/NetBeansProjects/JavaApplication2/src/problem1.in");
            Scanner s =new Scanner(f);
            
            while(s.hasNext()){
                
                a=a + s.nextLine();
                
            }
            
            StringTokenizer st=new StringTokenizer(a,"|");
            StringBuilder sb = new StringBuilder();
            
            while (st.hasMoreElements()) {
 
		    String name = st.nextElement().toString();
		    String bday = st.nextElement().toString();
		    String timein = st.nextElement().toString();
                    String timeout = st.nextElement().toString();
                    	
			sb.append("\nName : " + name);
			sb.append("\nBirthday : " + bday);
			sb.append("\nTime in : " + timein);
                        sb.append("\nTime out : " + timeout);
			sb.append("\n*******************\n");
 
			System.out.println(sb.toString());
            }
            
            System.out.println(a);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
}
