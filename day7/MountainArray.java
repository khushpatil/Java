package day7;

public class MountainArray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 7, 6, 5, 2, 1 };
        System.out.print(peak(nums));
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
}
