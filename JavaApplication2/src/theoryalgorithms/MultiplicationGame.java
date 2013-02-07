/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theoryalgorithms;

/**
 *
 * @author ppp
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class MultiplicationGame {
    private static enum Player {
        STAN, OLLIE
    }
 
    private static final int[] MAX_VALUES = new int[14];
 
    static {
        int c = 1;
        for (int n = 0; n <= 13; n++) {
            if (n % 2 == 0) {
                c *= 9;
            } else {
                c *= 2;
            }
            MAX_VALUES[n] = c;
        }
    }
 
    public static void main(String args[]) {
        MultiplicationGame.begin();
    }
 
    private static void begin() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long g = sc.nextLong();
            Player winner = getWinner(g);
            switch (winner) {
                case STAN:
                    System.out.println("Stan wins.");
                    break;
                case OLLIE:
                    System.out.println("Ollie wins.");
                    break;
                default:
                    break;
            }
        }
    }
 
    private static Player getWinner(long g) {
        Player winner = Player.STAN;
        for (int n = MAX_VALUES.length - 1; n >= 0; n--) {
            if (g > MAX_VALUES[n]) {
                if (n % 2 == 0) {
                    winner = Player.OLLIE;
                }
                break;
            }
        }
 
        return winner;
    }}
