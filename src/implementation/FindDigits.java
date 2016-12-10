package implementation;


import java.util.Scanner;

/**
 * Created by a7medM on 5/5/2016.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/find-digits
public class FindDigits {

    public FindDigits() {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < testCases; t++) {
            int number = Integer.parseInt(scanner.nextLine());
            int temp = number, count = 0;
            while (temp != 0) {
                int remainder = temp % 10;
                if (remainder != 0 && number % remainder == 0)
                    count++;
                temp /= 10;
            }
            System.out.println(count);
        }
    }
}
