package day5;

import java.util.*;

public class Searchin2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.print("Enter the elements in the array: ");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.print("Which element do you want to find: ");
        int check = in.nextInt();
        System.out.print("The element is located at the following row and column indices: "
                + Arrays.toString(search(arr, check)));
        System.out.println("The maximum element in the array is: " + max2D(arr));
    }

    static int[] search(int[][] arr, int t) {
        int[] ans = new int[2];
        if (arr.length == 0) {
            return null;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == t) {
                    ans[0] = row;
                    ans[1] = col;
                    return ans;
                }
            }
        }
        return null;
    }

    static int max2D(int[][] arr) {
        int max = 0;
        if (arr.length == 0) {
            return -1;
        }
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
}
