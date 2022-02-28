package day2;

import java.util.*;

// public class Revnum {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter any number you want: ");
//         String num = in.next().trim();
//         String new_num = "";
//         for (int i = num.length() - 1; i >= 0; i--) {
//             new_num += num.charAt(i);
//         }
//         System.out.print(new_num);
//     }

// }

public class Revnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number you want: ");
        int num = in.nextInt();
        int ans = 0;
        do {
            int new_num = num % 10;
            num = num / 10;
            ans = ans * 10 + new_num;
        } while (num > 0);
        System.out.print(ans);
    }
}