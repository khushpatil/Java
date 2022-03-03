package day5;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.print("Enter the element you want to find: ");
        int t = in.nextInt();
        System.out.print(linersearch(numbers, t));
    }

    static int linersearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
