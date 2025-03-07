package gr.aueb.cf.lef.ch2;

import java.util.Scanner;

/**
 * Converts miles to km
 */

public class MilesToKm {

    public static void main(String[] args) {

        final double KM_PER_MILE = 1.6;
        double miles = 0.0;
        double km = 0.0;
        Scanner s = new Scanner(System.in);

        System.out.println("Please insert miles");
        miles = s.nextDouble();

        km = miles * KM_PER_MILE;

        System.out.println("Miles:" + miles + ", Km:" + km);

    }
}
