package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by a7medM on 5/12/2016.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/lonely-integer
public class LonelyInteger {

    public LonelyInteger() {
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        int lonelyNumber = 0;
        for (int i = 0; i < arraySize; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        //    Collections.sort(numbers);
        for (int index1 = 0; index1 < numbers.size(); index1++) {
            int number = numbers.get(index1);
            if (isExist(numbers, number) == -1) {
                lonelyNumber = number;
                System.out.println(number + "  " + isExist(numbers, number));
            }
        }
        System.out.println(lonelyNumber);
    }

    private static int isExist(ArrayList<Integer> numbers, int number) {
        for (int i = 1; i < numbers.size(); i++) {
            System.out.println(number + " VS " + numbers.get(i));
            if (number == numbers.get(i)) {

                return i;
            }
        }
        return -1;
    }
}
