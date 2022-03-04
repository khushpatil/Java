package day6;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements in the array: ");
        int n = in.nextInt();
        System.out.print("Enter the elements in a sorted manner: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("ENter the element to be searched: ");
        int target = in.nextInt();
        System.out.print("The element is at the index " + binary_search(nums, target));
    }

    static int binary_search(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] < t) {
                start = middle + 1;
            } else if (arr[middle] > t) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
