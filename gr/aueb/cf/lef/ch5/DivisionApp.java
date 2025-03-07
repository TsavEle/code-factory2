package gr.aueb.cf.lef.ch5;

import java.util.Scanner;

/**
 * Double and Float demo.
 */
public class DivisionApp {

    public static void main(String[] args) {

        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0d;
        double mod = 0.0;
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter two doubles");
        num1 = s.nextDouble();
        num2 = s.nextDouble();

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %.2f", mod);
    }
}
