package gr.aueb.cf.lef.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ευρώ σε δολάρια και cents
 * Η ισοτιμία είναι 1 ευρώ = 99cents
 */

public class EuroUsdConverter {

    public static void main(String[] args) {

        int  e;
        System.out.println("Δώστε τιμή ευρώ");
        Scanner s = new Scanner(System.in);
        e = s.nextInt();

        int dollars = (e*99)/100;
        int cents = (e*99)%100;
        System.out.println("Τα δολάρια ειναι" + "" + dollars );
        System.out.println("Τα cents είναι" + "" + cents);
        s.close();



    }
}

