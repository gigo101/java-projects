/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class continueDemo {
    public static void main(String[] args){
        String searchme="peter piper picked a peck of pickeld peppers";
        int numps=0;
        int a=0;
        for(a=0; a<searchme.length(); a++){
            if(searchme.charAt(a)!='p'){
                continue;    
            }
            numps++;
        }
        System.out.println("found " + numps + " p's in the string");
    }
}
