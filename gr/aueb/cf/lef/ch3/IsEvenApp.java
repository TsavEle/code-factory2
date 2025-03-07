package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

/**
 * Ελέγχει εάν ένας ακέραιος είναι άρτιος
 */

public class IsEvenApp {

    public static void main(String[] args) {

        int num = 0;
        Scanner s = new Scanner(System.in);
        boolean isEven = false;

        System.out.println("Πληκτρολογήστε αριθμό");
        num = s.nextInt();

        isEven = num % 2 == 0;

        System.out.printf("%d is even: %b", num, isEven);



    }
}
