package implementation;


import java.util.ArrayList;
import java.util.Scanner;

//Problem on HackerRank: https://www.hackerrank.com/challenges/angry-professor

/*
 * solved 21 February 2016
 */
public class AngryProfessor {

    public AngryProfessor() {
        int n = 0, k = 0;
        ArrayList<String> outputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int t = 0; t < times; t++) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            if (n < k) {
                return;
            }
            int times_arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                times_arr[i] = scanner.nextInt();
            }
            int before = 0;
            for (int i = 0; i < times_arr.length; i++) {
                int time = times_arr[i];
                if (time <= 0)
                    before++;
            }
            if (before < k)
                outputs.add("YES");
            else
                outputs.add("NO");
        }

        for (String string : outputs) {
            System.out.println(string);
        }

    }
}