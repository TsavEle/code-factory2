package gr.aueb.cf.lef.ch4;

import java.math.BigInteger;

/**
 * Calculates a^n. E.g 2^10 = 1024.
 */

public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
        int power = 100;
        int result = 1;

        // for to calculate base ^ power

        for (int i = 1; i <= power; i++) {
            result = result * base; // result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
            // μετατρέπω το base σε bigInteger με valueOf
            // multiply είναι όπως το .nextInt
        }

        System.out.println("Result: " + result);
        System.out.println("Result: " + bigResult);
    }
}
