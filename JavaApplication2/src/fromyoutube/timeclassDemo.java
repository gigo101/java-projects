/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fromyoutube;

/**
 *
 * @author ppp
 */
public class timeclassDemo {
    public static void main(String[] args){
        timeclass t1=new timeclass();
        System.out.println(t1.toMilitaryTime());
        
        t1.setTime(2, 59, 59);
        System.out.println(t1.toMilitaryTime());
        System.out.println(t1.toString());
        
    }
    
}
