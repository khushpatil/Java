package day5;

import java.util.*;

public class SearchinString {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter any String: ");
        // String s = in.nextLine();
        // System.out.print("Enter character to find: ");
        // char c = in.next().charAt(0);
        // System.out.print(searchstring(s, c));
        int[] nums = { 500, 3, 34, 46, 2, 54, 99 };
        System.out.print(findmin(nums));

    }

    static int stringsearch(String a, char c) {
        if (a.equals("")) {
            return -1;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }

    static boolean searchstring(String a, char c) {
        if (a.length() == 0) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                return true;
            }
        }

        return false;
    }

    static int searchinrange(int[] arr, int target, int u, int l) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = u; i <= l; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int findmax(int[] arr) {
        int temp = 0;
        if (arr.length == 0) {
            return -1;
        }

        for (int a : arr) {
            if (a > temp) {
                temp = a;
            }
        }
        return temp;
    }

    static int findmin(int[] arr) {
        int temp = arr[0];
        if (arr.length == 0) {
            return -1;
        }

        for (int a : arr) {
            if (a < temp) {
                temp = a;
            }
        }
        return temp;
    }
}
