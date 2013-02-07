/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theoryalgorithms;

/**
 *
 * @author ppp
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
 
// class Main provided by programming challenges
// there are slight modifications
public class HowManyFibbs implements Runnable{
 
// utility function to read from stdin,
// Provided by Programming-challenges
// I have changed it such that it takes a word
//(instead of a line), the word is composed
// solely of digits, other characters are delimiters
// It returns null if eof is reached
    static String ReadWord(int maxLength){
        byte line[] = new byte [maxLength];
        int length = 0;
        int input = -1;
        try{
            while (length < maxLength){
                input = System.in.read();
                if(input < 0) break;
                if (!Character.isDigit(input)) {
                    if(length == 0) continue;
                    else break;
                }
                line [length++] += input;
            }
 
            if ((input < 0) && (length == 0)) return null;
            return new String(line, 0, length);
        } catch (IOException e){
            return null;
        }
    }
 
    public static void main(String args[])
    {
        HowManyFibbs myWork = new HowManyFibbs();
        myWork.run();
    }
 
    public void run() {
        new myStuff().run();
    }
}
 
class myStuff implements Runnable{
 public void run(){
     ArrayList<BigInteger> fibs = new ArrayList<BigInteger>(500);
     fibs.add(BigInteger.ONE);
     fibs.add(BigInteger.ONE.add(BigInteger.ONE));
 
     BigInteger upperLimit = BigInteger.TEN.pow(100);
 
     while(fibs.get(fibs.size()-1).compareTo(upperLimit) < 0) {
         fibs.add(fibs.get(fibs.size()-1).add(fibs.get(fibs.size()-2)));
     }
 
     BigInteger a = new BigInteger(HowManyFibbs.ReadWord(500));
     BigInteger b = new BigInteger(HowManyFibbs.ReadWord(500));
     while(BigInteger.ZERO.compareTo(b) != 0) {
 
         // simulate lower_bound
         int ix1 = Collections.binarySearch(fibs, a);
         if(ix1 < 0) ix1 = -ix1 - 1;
 
         // simulate upper_bound
         int ix2 = Collections.binarySearch(fibs, b);
         if(ix2 >= 0) ix2++;
         else ix2 = -ix2 - 1;
 
         System.out.println((ix2 - ix1));
             
         a = new BigInteger(HowManyFibbs.ReadWord(500));
         b = new BigInteger(HowManyFibbs.ReadWord(500));
     }
 }
}
