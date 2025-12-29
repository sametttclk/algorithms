package algorithms.warmup.swapwithouttemp;

public class Solution {

    public static void swap(int a, int b) {
        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        // Method 1: Addition & Subtraction
        a = a + b;
        b = a - b;
        a = a - b;

        /*
         * Method 2: XOR Swap (alternative solution)
         * Safer for overflow scenarios
         *
         * a = a ^ b;
         * b = a ^ b;
         * a = a ^ b;
         */

        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        swap(a, b);
    }
}
