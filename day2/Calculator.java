package day2;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is the calculator");
        char cont;
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        int ans = 0;
        do {
            System.out.print("Enter an operation(-,+,/,*): ");
            char op = in.next().trim().charAt(0);
            System.out.print("Enter the second number: ");
            int num2 = in.nextInt();
            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
            }
            System.out.println("The ans is " + ans);
            System.out.print("Press y to continue or n to restart the calculator(y/n): ");
            cont = in.next().trim().charAt(0);
            num1 = ans;
        } while (cont == 'y');
        main(args);
    }

}
