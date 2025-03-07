package gr.aueb.cf.lef.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    public static long pow(long a, long n) {
//        if (n == 0) return 1;
//        return pow(a,n-1) * a;
        return (n == 0) ? 1L : n * pow(a,n-1) * a;
    }
}
