package day5;

import java.util.*;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int count = 0;
        for (int a : nums) {
            if (num_digits(a)) {
                count++;
            }
        }
        System.out.print("There are " + count + " numbers with even digits in the array");

    }

    static boolean num_digits(int a) {
        int num = 0;
        while (a > 0) {
            a /= 10;
            num++;
        }
        return (num % 2 == 0);
    }
}
