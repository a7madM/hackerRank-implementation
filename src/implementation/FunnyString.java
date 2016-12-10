package implementation;

import java.util.Scanner;

/**
 * Created by a7medM on 5/12/2016.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/funny-string
public class FunnyString {

    public FunnyString() {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCases; i++) {
            String testCase = scanner.nextLine();
            String funny = "Funny";
            for (int index1 = 0, index2 = testCase.length() - 1; index1 < testCase.length() / 2; index1++, index2--) {
                int value1 = Math.abs((int) testCase.charAt(index1) - (int) testCase.charAt(index1 + 1));
                int value2 = Math.abs((int) testCase.charAt(index2) - (int) testCase.charAt(index2 - 1));
                if (value1 != value2) {
                    funny = "Not Funny";
                    break;
                }
            }
            System.out.println(funny);
        }
    }
}
