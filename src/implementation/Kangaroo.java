package implementation;

import java.util.Scanner;

/**
 * Created by a7mad on 20/07/16.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/kangaroo
public class Kangaroo {


    public Kangaroo() {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        while (true) {
            if (x2 > x1 && v2 > v1 || x1 > x2 && v1 > v2 || v1 == v2) {
                System.out.println("NO");
                break;
            }
            if ((x1 += v1) == (x2 += v2)) {
                System.out.println("YES");
                break;
            }
        }

    }
}
