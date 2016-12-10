package implementation;

import java.util.Scanner;

/**
 * Created by a7medM on 5/12/2016.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/utopian-tree
public class UtopianTree {

    public UtopianTree() {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int time = 0; time < testCases; time++) {

            int testCase = Integer.parseInt(scanner.nextLine());
            int h = 1;
            for (int i = 0; i < testCase; i++) {
                if (i % 2 == 0) {
                    h *= 2;
                } else {
                    h += 1;
                }
            }
            System.out.println(h);
        }
    }
}
