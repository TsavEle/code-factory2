package gr.aueb.cf.lef.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει την τιμή που δίνει ο χρήστης
 * συμπεριλαμβάνοντας το Φ.Π.Α.
 */

public class PriceWithVat {

    public static void main(String[] args) {

       double price = 0.0;
       double price_vat = 0.0;
       Scanner s = new Scanner(System.in);

       System.out.println("Please insert price");

       price = s.nextDouble();
       price_vat = price + (price * 24)/100;

        System.out.printf("Price: %.2f, Price with vat: %.2f\n", price, price_vat);
    }
}
