package day7;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
        System.out.print(ceiling(arr, 17));
    }

    static int ceiling(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        if (isAsc) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] < t) {
                    start = mid + 1;
                } else if (arr[mid] > t) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] < t) {
                    end = mid - 1;
                } else if (arr[mid] > t) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        if (isAsc) {
            if (t > arr[arr.length - 1]) {
                return arr[arr.length - 1];
            } else
                return arr[start];
        } else {
            return arr[end];
        }
    }
}