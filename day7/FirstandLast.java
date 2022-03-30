package day7;

import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.print(Arrays.toString(firstlast(arr, 9)));
    }

    static int[] firstlast(int[] arr, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                if (mid == 0) {
                    ans[0] = -1;
                    ans[1] = arr[mid];
                    return ans;
                } else if (mid == arr.length - 1) {
                    ans[0] = arr[mid];
                    ans[1] = -1;
                    return ans;
                } else {
                    ans[0] = arr[mid - 1];
                    ans[1] = arr[mid + 1];
                    return ans;
                }
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}
