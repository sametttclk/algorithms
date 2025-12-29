package algorithms.warmup.simplearraysum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void simpleArraySum(List<Integer> arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an integer value for size of array:");
        int arraySize = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr.add(rand.nextInt(14));
        }

        System.out.println("Input: " + arr);
        simpleArraySum(arr);

        scanner.close();
    }
}
