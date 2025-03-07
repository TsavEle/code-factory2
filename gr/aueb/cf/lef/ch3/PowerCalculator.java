package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το b^power
 */
public class PowerCalculator {

    public static void main(String[] args) {

        int num = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Insert base and power");
        num = s.nextInt();
        power = s.nextInt();

        while(i <= power) {
            result  *= num;    // result = result * num;
            i++;
        }

        System.out.println("The result is:" + result);



    }
}
