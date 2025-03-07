package gr.aueb.cf.lef.ch4;

/**
 * Calculates sum and mul of the 10 first integers.
 */

public class ForSumMullApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i; //sum = sum + 1
            mul *= i; //mul = mul * i
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
