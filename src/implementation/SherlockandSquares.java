package implementation;


import java.util.Scanner;

/**
 * Created by a7medM on 5/5/2016.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/sherlock-and-squares
public class SherlockandSquares {
    public SherlockandSquares() {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < times; t++) {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int count = 0;
            int factor = (int) Math.sqrt(number1);
            int squared = factor * factor;
            if (squared == number1)
                count++;
            while (squared <= number2) {
                factor++;
                squared = factor * factor;
                if (squared <= number2)
                    count++;
            }
            System.out.println(count);
        }
    }
}
