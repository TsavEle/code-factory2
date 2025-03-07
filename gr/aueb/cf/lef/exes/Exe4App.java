package gr.aueb.cf.lef.exes;

import java.util.Scanner;

public class Exe4App {

    public static void main(String[] args) {

        int num = 0;
        int i = 1;
        boolean isPrime = false;
        Scanner s = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε αριθμό");
        num = s.nextInt();
        if (checkIfPrime(num,i)){
            System.out.println("True");
        }
        else System.out.println("False");
    }





    public static boolean checkIfPrime(int num,int i) {

        if (num <= 1)
            return false;
        for ( i = 2; i < num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
