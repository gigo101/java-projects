/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class breakWithLabelDemo {
    
    public static void main(String[] args){
    
        int a=0;
        int b=0;
        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 }, 
            { 12, 1076, 2000, 8 }, 
            { 622, 127, 77, 955 }
        };
        int searchfor=2000;
        boolean foundit=false;
                
        search:
            for(a=0; a<arrayOfInts.length; a++){
                for(b=0; b<arrayOfInts[a].length; b++){
                     if(arrayOfInts[a][b]==searchfor){
                         foundit=true;
                         break search;
                     }   
                } 
            }
        if(foundit){
            System.out.println(searchfor + " found at " + "index " + a +" "+ b );
        }
    }
    
    
}
