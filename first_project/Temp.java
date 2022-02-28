package first_project;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        float tempc = input.nextFloat();
        double tempf = tempc * 1.8 + 32;
        System.out.print("The temperature in Farenheit is: " + tempf);
    }

}
