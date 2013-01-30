
import java.util.Set;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class MountainBike extends bicycle{
    
    int seats=0;
    
    void seats(int numseats){
    
        seats=numseats;
    
    }
    
    @Override
    void printstate(){
    
            System.out.println("Seats" + seats);
    }
    
}
