/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class bicycledemo {
    
    public static void main(String[] args){
        
        bicycle bike1=new bicycle();
        bicycle bike2=new bicycle();
        
        
        bike1.changegear(1);
        bike1.changecadence(2);
        bike1.speedup(3);
        bike1.brake(1);
        
        bike1.printstate();
    }
    
}
