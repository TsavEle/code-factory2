package gr.aueb.cf.lef.ch2;

/**
 * Converts years to days.
 */

import java.util.Scanner;

public class YearsToDays {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int years;
        int days;
        Scanner s = new Scanner(System.in);
        // Εντολές
        System.out.println("Πληκτρολογήστε έτη");
        years = s.nextInt();
        days = (365 * years) + (years / 4);
        //Εκτύπωση αποτελεσμάτων
        System.out.println("Οι ημέρες είναι: " + days);


    }
}
