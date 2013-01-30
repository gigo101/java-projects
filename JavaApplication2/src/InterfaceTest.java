/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class InterfaceTest {
    
    int cadence=0;
    int gear=0;
    int speed=0;
    
    void changecadence(int vcadence){
        
        cadence=vcadence;
     
     }
    
    void changegear(int vgear){
        
       gear=vgear;
    }
    
    void speedup(int vspeed){
    
       speed=speed+vspeed;
    }
    
    void brake(int decreasespeed){
        
        speed=speed-decreasespeed;
    }
    
    void printresult(){
        
        System.out.println("Gear " + gear + " Cadence " + cadence + " Speed " + speed);
    
    }
}
