package day7;

public class FindinMountain {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 4, 6, 8, 7, 5, 2 };
        System.out.print(search(arr, 3));
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int bs(int[] arr, int start, int end, int t) {
        boolean isAsc = arr[start] < arr[end];
        if (isAsc) {
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
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (t > arr[mid]) {
                    end = mid - 1;
                } else if (t < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    static int search(int[] arr, int t) {
        int start = 0;
        int end = peak(arr);
        int ans = bs(arr, start, end, t);
        if (ans == -1) {
            start = peak(arr);
            end = arr.length - 1;
        }
        ans = bs(arr, start, end, t);
        return ans;
    }
}
