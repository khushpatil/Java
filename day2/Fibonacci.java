package day2;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Till which number do you want the series: ");
        int st = in.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while (c < st) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
