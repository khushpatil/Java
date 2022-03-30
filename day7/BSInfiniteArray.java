package day7;

public class BSInfiniteArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.print(bs(nums, 13));
    }

    static int bs(int[] arr, int t) {
        int start = 0;
        int end = 3;
        boolean not_found = true;

        while (not_found) {
            if (t < arr[end]) {
                not_found = false;
            } else {
                int temp = end;
                start = temp;
                end += 3;
            }
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (t > arr[mid]) {
                start = mid + 1;
            } else if (t < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
