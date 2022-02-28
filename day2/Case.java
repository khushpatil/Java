package day2;

import java.util.*;

public class Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch = in.next().trim().charAt(0);
        if ((int) ch > 96 && (int) ch < 123) {
            System.out.print("This is a lower case letter");
        } else if ((int) ch > 64 && (int) ch < 91) {
            System.out.print("This is an upper case letter");
        } else {
            System.out.print("Nigga what have you typed?");
        }
    }
}
