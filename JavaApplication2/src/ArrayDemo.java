/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class ArrayDemo {
    
    public static void main(String[] args){
    
        int[] anArray = new int[10];
        int b=1;
        for (int a=0; a<=9; a++){
            
            anArray[a]= b++;
            System.out.println(anArray[a]);
        }
    }
    
}
