/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class stringcharAtPractice {
    public static void main(String[] args){
        
        String a="Hello World";
        String c="";
        String d="";
        
        int h=0;
         
        System.out.println("The length of the string is: " + a.length());
        
        for(int i=0;i<a.length();i++){
            
            if(a.charAt(i) !=' ' ){
                
                c = c+ a.charAt(i);
                h=h+1;
            }
            
            else{
                    break;
            }
        }
        
        for(int i=0;i<a.length();i++){
           
            if(i>h) {
                
                d=d + a.charAt(i);
            
            }      
        }   
        
        System.out.println(d +" "+c );
    }
    
}
