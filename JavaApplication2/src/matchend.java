
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class matchend {
    public static void main(String[] args)throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("/home/ppp/Documents/matchend.in"));
        int count=Integer.parseInt(reader.readLine());
        int stringcount=0;
        
        String line;
        
        do{
            line=reader.readLine();
            if(line.length()>3){
                if(line.charAt(0)==line.charAt(line.length()-1)){
                    stringcount=stringcount+1;   
                }
            }
            count--;
        }while(count > 0);
        System.out.println(stringcount);  
    }
    
}
