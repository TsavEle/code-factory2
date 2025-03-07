package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

/**
 * Demo of ternary operator
 * use case, that is conditional assignment.
 * abs(num) always positive.
 */
public class TernaryOperator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.println("Please insert a number");
        num = s.nextInt();

//        if (num >= 0) abs = num;
//        else abs = -num;

        abs = (num >= 0) ? num : -num;

//        ? είναι το then, : είναι το else.

        System.out.println("abs: " + abs);

    }
}
