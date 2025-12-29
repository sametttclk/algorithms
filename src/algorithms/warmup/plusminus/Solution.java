package algorithms.warmup.plusminus;

import java.util.*;

public class Solution {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        float positive = 0;
        float negative = 0;
        float zero = 0;

        for (int value : arr) {
            if (value > 0) positive++;
            else if (value < 0) negative++;
            else zero++;
        }

        System.out.printf("%.6f%n", positive / n);
        System.out.printf("%.6f%n", negative / n);
        System.out.printf("%.6f%n", zero / n);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(
                -4, 3, -9, 0, 4, 1,
                new Random().nextInt(11) - 5,
                new Random().nextInt(11) - 5
        );

        System.out.println("Input: " + arr);
        plusMinus(arr);
    }
}
