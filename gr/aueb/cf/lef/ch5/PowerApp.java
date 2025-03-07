package gr.aueb.cf.lef.ch5;

public class PowerApp {

    public static void main(String[] args) {

    }

    /**
     * Calculates a^n
     * @param a the base
     * @param n the power
     * @return the result of a^n
     */
    public static long pow(long a, long n) {
//        long result;
//        for (int i = 1; i <= n; i++) {
//            result =* a;
//        }
//        return result;
        return (long) Math.pow(a, n);
    }
}
