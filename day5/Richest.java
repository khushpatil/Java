package day5;

import java.util.*;

public class Richest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many people are there: ");
        int r = in.nextInt();
        System.out.print("How many bank accounts do they have: ");
        int c = in.nextInt();
        System.out.print("Enter their wealth: ");
        int[][] wealth = insert(r, c);
        ArrayList<Integer> ind_wealth = richest(wealth, r);
        System.out.println("The individual wealth of people is " + ind_wealth.toString());
        System.out.println("The highest wealth is " + max(ind_wealth));

    }

    static int[][] insert(int row, int col) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                arr[r][c] = in.nextInt();
            }
        }
        return arr;
    }

    static int add(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    static ArrayList<Integer> richest(int[][] arr, int r) {
        int money = 0;
        ArrayList<Integer> data = new ArrayList<>();
        for (int[] person : arr) {
            money = add(person);
            data.add(money);
        }
        return data;
    }

    static int max(ArrayList<Integer> d) {
        int max = 0;
        for (int a : d) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
