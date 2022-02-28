package first_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Nice meeting you " + name);
        int count = 1;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
    }
}