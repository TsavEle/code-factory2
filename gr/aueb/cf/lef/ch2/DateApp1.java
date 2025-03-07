package gr.aueb.cf.lef.ch2;

import java.util.Scanner;

/** Ζητάει ημέρα, μήνα και έτος απο το χρήστη
 * και εκτυπώνει στην κονσόλα την ημερομηνία σε μορφή
 * ΧΧ/ΧΧ/ΧΧΧΧ
 */

public class DateApp1 {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        System.out.println("Δώστε μέρα" ); // ΖΗΤΑΕΙ ΗΜΕΡΑ ΑΠΟ ΤΟ ΧΡΗΣΤΗ
            Scanner d = new Scanner(System.in);
            day = d.nextInt();

        System.out.println("Δώστε μήνα"); // ΖΗΤΑΕΙ ΜΗΝΑ ΑΠΟ ΤΟ ΧΡΗΣΤΗ
            Scanner m = new Scanner(System.in);
            month = m.nextInt();

        System.out.println("Δώστε έτος"); // ΖΗΤΑΕΙ ΕΤΟΣ ΒΑΠΟ ΤΟ ΧΡΗΣΤΗ
            Scanner y = new Scanner(System.in);
            year = y.nextInt();
        System.out.println("Η ημερομηνία είναι");
        System.out.printf("%02d/%02d/%d", day,month,year);
        d.close();
        m.close();
        y.close();






    }
}
