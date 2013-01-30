
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class vowelsConsonants {
    
    public static int countvowels(String n){
        int vowels=0;
        char a[]={'a','e','i','o','u'};
        int s=n.length();
        
        for (int i=0;i<s;i++){
            char b=n.charAt(i);
            
            for(int x=0;x<a.length;x++){
                
                if (b==a[x]){
                    vowels++;
                }
            
            }
            
            }
        
        
        
        return vowels;
    }
    
    public static int counconsonants(String n){
        int consonants=0;
        char a[]={'b','c','d','f','g','h','j','k','l','n','p','q','r','s','t','v','w','x','y','z'}; 
        int s=n.length();
        
        for (int i=0;i<s;i++){
            char b=n.charAt(i);
            
            for(int x=0;x<a.length;x++){
                
                if (b==a[x]){
                    consonants++;
                }
            
            }
            
            }
        
        
        
        return consonants;
    }
    public static void main(String[] args){
        
        Scanner dataIn =  new Scanner(System.in);
        
        String a=null;
        
        System.out.println("enter string");
        
        a=dataIn.next();
        
        System.out.println(countvowels(a));
        System.out.println(counconsonants(a));
    }
    
}
