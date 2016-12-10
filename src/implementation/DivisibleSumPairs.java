package implementation;


import java.util.Scanner;

/**
 * Created by a7mad on 21/07/16.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/divisible-sum-pairs?h_r=next-challenge&h_v=zen

public class DivisibleSumPairs {

    public DivisibleSumPairs() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int pairs = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int x = i + 1; x < n; x++) {
                int sum = a[i] + a[x];
                if (sum % k == 0) {
                    pairs++;
                }
            }
        }

        System.out.println(pairs);
    }
}
