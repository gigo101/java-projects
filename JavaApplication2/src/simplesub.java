
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class simplesub {
    
    public static void main(String[] args){
        
        char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int c=a.length;
        char x[] = new char[c];
        
        Scanner dataIn=new Scanner(System.in);
        System.out.println("Enter plain text");
        String input=dataIn.next();
        
        System.out.println("Enter key");
        int key=dataIn.nextInt();
        
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
}
}
