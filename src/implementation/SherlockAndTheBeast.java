package implementation;


//Problem on HackerRank: https://www.hackerrank.com/challenges/sherlock-and-the-beast


import java.util.Scanner;

/**
 * Created by a7medM on 2/22/2016.
 */
public class SherlockAndTheBeast {
    static int factor = 11;

    public SherlockAndTheBeast() {
        Scanner scanner = new Scanner(System.in);
        int testCasesNum = scanner.nextInt();
        long num = -1;
        for (int x = 0; x < testCasesNum; x++) {
            int input = scanner.nextInt();
            if ((input % 3) == 0) {
                num = produceFive(input);
            } else if ((input % 5) == 0) {
                num = produceThree(input);
            } else {
                int v5, v3 = 0;
                do {
                    v5 = input - (v3 + 3);
                    v3 = v3 + 3;
                } while ((v5 % 5) != 0 || (v5 <= 0));
                if ((v3 % 3) == 0 && (v5 % 5) == 0) {
                    //System.out.println("Thress " + v3 + " Fives  " + v5);
                    String s = String.valueOf(produceFive(v3)) + String.valueOf(produceThree(v5));
                    System.out.println(s);
                    return;
                    //num = Integer.parseInt(s);
                } else
                    num = -1;
            }
            System.out.println(num);
        }
    }

    private static long produceThree(int input) {
        long num = -1;
        int limit = input / 5;
        for (int i = 2; i < input; i++) {
            factor += Math.pow(10, i);
        }
        num = 3 * factor;
        factor = 11;
        return num;
    }

    private static long produceFive(int input) {
        long num;
        int limit = input / 3;
        for (int i = 2; i < input; i++) {
            factor += Math.pow(10, i);
        }
        num = 5 * factor;
        factor = 11;
        return num;
    }
}
