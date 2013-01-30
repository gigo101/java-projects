/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class factorialDemo {
    
    public static void factorial(int number){
        
        int factorial=1;
        
        for (int a=1;a<=number;a++){
            
            factorial=factorial * a; //1*2*3*4
            System.out.println(factorial);
        }
        
    
    }
    
    public static  void main(String[] args){
        
        factorial(6);
        
        
            }
    
    
    
}
