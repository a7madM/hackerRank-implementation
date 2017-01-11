package main;

import implementation.*;

public class Main {

    public static void main(String[] args) {
        // new Kangaroo();
        // new DivisibleSumPairs();

        // new EqualStacks();

        MiniMaxSum miniMaxSum = new MiniMaxSum();
        long[] input = miniMaxSum.getInput();

        long[] output = miniMaxSum.getResults(input);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}