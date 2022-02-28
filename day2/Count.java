package day2;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a biiig number: ");
        String num = in.next().trim();
        System.out.println("This is the number: " + num);
        System.out.print("Select a digit from it: ");
        char dig = in.next().trim().charAt(0);
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (dig == num.charAt(i)) {
                count += 1;
            }
        }
        System.out.print("The digit " + dig + " appears " + count + " times");
    }

}
