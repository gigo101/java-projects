
import java.io.StringWriter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class bbb {
    
    public static void main(String[] args){
    
        String a="babble";
        int b=a.length();
        char[] c= new char[b];
        char d=a.charAt(0);
        
        c[0]=d;
        System.out.print(c[0]);
        for (int i=0;i<a.length();i++){
                c[i]=a.charAt(i);
            }
        
        for (int i=1;i<a.length();i++){
                if(c[i]==d){   
                     c[i]='*';
                     System.out.print(c[i]);
                }else{    
                    System.out.print(c[i]);
                }
         
            }
        
        
            
            
          
        }
 
    }
    

