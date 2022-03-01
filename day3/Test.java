package day3;

import java.util.*;

public class Test {
    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.print(a + " " + b);
    }

    static boolean isPrime(int number) {
        // if (number <= 1) {
        // return false;
        // }
        // int c = 2;
        // while (c * c < number) {
        // if (number % c == 0) {
        // return false;
        // }
        // c++;
        // }
        // return c * c > number;
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return 4 > number;
    }

    static boolean arm_number(int n) {
        int sum = 0;
        int og = n;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }
        return sum == og;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter number 1: ");
        // int number1 = in.nextInt();
        // System.out.print("Enter number 2: ");
        // int number2 = in.nextInt();
        // int ans = add(number1, number2);
        // System.out.print(ans);
        // System.out.print(isPrime(number1));
        // boolean ans = arm_number(number1);
        // System.out.print(ans);
        for (int i = 100; i < 1000; i++) {
            if (arm_number(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
