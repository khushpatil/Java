package day4;

import java.util.*;

public class Arrayops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int[] arr = new int[in.nextInt()];
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Which elements do you want to swap: ");
        int a = in.nextInt();
        int b = in.nextInt();
        swap(arr, a - 1, b - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("The greatest integer in the array is " + max(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int max(int[] arr) {
        int temp = 0;
        for (int a : arr) {
            if (a > temp) {
                temp = a;
            }
        }
        return temp;
    }

    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
