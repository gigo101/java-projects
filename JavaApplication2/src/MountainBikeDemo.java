/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class MountainBikeDemo {
    
    public static void main(String[] args){
    
        MountainBike mbike = new MountainBike();
        
        
        mbike.changegear(1);
        mbike.changecadence(2);
        mbike.speedup(4);
        mbike.brake(1);
        mbike.seats(4);
        
        mbike.printstate();
        
    }
    
}
