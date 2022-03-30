package day7;

public class CharArray {
    public static void main(String[] args) {
        char[] arr = { 'a', 'c', 'e', 'f', 'h' };
        System.out.print(charceiling(arr, 'g'));
    }

    static char charceiling(char[] arr, char a) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < a) {
                start = mid + 1;
            } else if (arr[mid] > a) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
