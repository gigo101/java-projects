/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class NewBicycleDemo {
    
    public static void main(String[] args){
    
        NewBicycle b1=new NewBicycle(1, 1, 1);
        NewBicycle b2=new NewBicycle();
        
        b2.setCadence(2);
        b2.setGear(2);
        b2.setSpeed(2);
        
        System.out.println(b1.getGear() + " " +  b1.getCadence() +" "+ b1.getSpeed());
        b2.displayResult();
    }
    
}
