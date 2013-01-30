
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class simplesub_fileinput {
    public static void main(String[] args) throws IOException{
        String line;
        BufferedReader reader =new BufferedReader(new FileReader("/home/ppp/Documents/simplesub.in"));
       
        char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int c=a.length;
        char x[] = new char[c];
        
        line = reader.readLine();
        int key= Integer.parseInt(line);
        String input="";
         
        while((line=reader.readLine())!=null){
            
             input =line;
             System.out.println(input);
             
             String b="";
        for (int i=0;i<a.length;i++){
            
            System.out.print(a[i]);
                
        }
        
        System.out.println();
        
        for (int i=0;i<a.length;i++){
            if(i>key-1){
                b=b+a[i];
            }    
        }
        
        for (int i=0;i<a.length;i++){
            if(i<key){
                b=b+a[i];
            }
         }
        System.out.println(b);
        System.out.println("Key is " + key);
        
        for (int i=0;i<b.length();i++){
            x[i]=b.charAt(i);
            
        }
        
        System.out.print("Ciphertext is: ");
        for (int i=0;i<input.length();i++){
            
            for(int q=0;q<a.length;q++){
                if(input.charAt(i)==a[q]){
                    System.out.print(x[q]);            
                }
            }
       
        }
        
        System.out.println("\n");
             
        }     
    
    }
    
}
