package day2;

import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 3 numbers");
        List<Integer> numbers = new ArrayList<Integer>();
        int count = 0;
        while (count != 3) {
            System.out.print("Enter the number: ");
            numbers.add(input.nextInt());
            count++;
        }
        int gnum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > gnum) {
                gnum = numbers.get(i);
            }
        }
        System.out.print("The greatest number is: " + gnum);
    }
}