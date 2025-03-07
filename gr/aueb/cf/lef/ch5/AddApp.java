package gr.aueb.cf.lef.ch5;

import java.util.Scanner;

/**
 * Calculates sum of 2 integers.
 * With usage of methods.
 */

public class AddApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please insert two integers");
        a = s.nextInt();
        b = s.nextInt();

        sum = AddApp.add(a, b);
        sub = sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * Adds two integers
      * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */

    public static int add(int a, int b) {
//        int result = 0;
//
//        result = a+ b;
//
//        return result;

        return a + b;
    }

    /**
     * Subtracts two integers
     * @param a the first integer to subtract from
     * @param b the integer to subtract with
     * @return the subtraction
     */

    public static int sub(int a, int b) {

        return a - b;
    }
}
