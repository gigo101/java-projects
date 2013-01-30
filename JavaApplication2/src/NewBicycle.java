/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class NewBicycle {
    
    private int cadence=0;
    private int gear=0;
    private int speed=0;
    
    public NewBicycle(){
    
    }
    public NewBicycle(int cadence, int gear, int speed) {
        
        this.cadence=cadence;
        this.gear=gear;
        this.speed=speed;
        
    }
    
    public int getCadence(){
        return cadence;
    
    }
    
    public void setCadence(int cadence){
        this.cadence=cadence;
        
    }
    
    public int getGear(){
        return gear;
    
    }
    
    public void setGear(int gear){
        this.gear=gear;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int speed){
        
        this.speed=speed;
    }
    
    public void displayResult(){
        
        System.out.println(speed +" "+ gear +" "+ cadence);
    }
}
