/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class breakDemo {
    
    public static void main(String[] args){
    
        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000,8, 622, 127 };
        int searchfor = 8;
        int a=0;
        
        boolean foundit=false;
        
        for (a=0; a<arrayOfInts.length; a++){
                
            if(arrayOfInts[a]==searchfor){
            
                foundit=true;
                break;
            
            }
            
     
        }
        
         if(foundit){
        
            System.out.println(searchfor + " found at " + "index " + a);
        }
        else{
            
            System.out.println("Number not found");
        
        }
        
        
        
            
    }
    
}
