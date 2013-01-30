
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
import java.io.*;
public class staticAndNonstaticDiscussion {
    
    static int a=6;
    int b=6;
    
    
    static int increment(){
        return a++;
    }
    
    int incrementb(){
        return b++;
    }
    
    public static void main(String[] args){
        
        System.out.println(increment());
        System.out.println(increment());
        
        staticAndNonstaticDiscussion s=new staticAndNonstaticDiscussion();
        staticAndNonstaticDiscussion x=new staticAndNonstaticDiscussion();
        
        System.out.println(s.incrementb());
        System.out.println(x.incrementb());
        
        System.out.println(increment());
    }
    
}
