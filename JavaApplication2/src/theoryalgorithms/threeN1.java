/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theoryalgorithms;

/**
 *
 * @author ppp
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class threeN1 {
    public static void main(String args[]) {
        threeN1.begin();
    }

    private static void begin() {
        Scanner sc = new Scanner(System.in);
        StringTokenizer idata;

        int i, j, min, max;

        while (sc.hasNextLine()) {
            idata = new StringTokenizer(sc.nextLine());
            i = Integer.parseInt(idata.nextToken());
            j = Integer.parseInt(idata.nextToken());

            if (i < j) {
                min = i;
                max = j;
            } else {
                min = j;
                max = i;
            }

            int maxCl = 0;
            for (int y = min; y <= max; ++y) {
                int cl;
                int n = y;
                for (cl = 1; n > 1; ++cl) {
                    n = (n % 2) == 0 ? n >> 1 : n * 3 + 1;
                }

                if (cl > maxCl) {
                    maxCl = cl;
                }
            }

            System.out.printf("%d %d %d\n", i, j, maxCl);
        }
    }
}
