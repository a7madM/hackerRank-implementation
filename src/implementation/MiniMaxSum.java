package implementation;

import java.util.Scanner;

/**
 * Created by a7mad on 11/01/17.
 */
public class MiniMaxSum {

    Scanner scanner;
    long[] input;
    int min_index, max_index;

    public MiniMaxSum() {
        scanner = new Scanner(System.in);
    }

    public long[] getInput() {
        long min = -1, max = -1;
        input = new long[5];
        for (int i = 0; i < 5; i++) {
            long number = scanner.nextLong();
            if (min == -1 && max == -1) {
                min = number;
                max = number;
                min_index = i;
                max_index = i;
            }
            if (min > number) {
                min = number;
                min_index = i;
            }
            if (max < number) {
                max = number;
                max_index = i;
            }
            input[i] = number;
        }
        return input;
    }

    public long[] getResults(long[] input) {
        long[] output = new long[2];
        long min_sum = 0, max_sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (i != min_index)
                max_sum += input[i];
            if (i != max_index)
                min_sum += input[i];
        }
        output[0] = min_sum;
        output[1] = max_sum;
        return output;
    }
}
