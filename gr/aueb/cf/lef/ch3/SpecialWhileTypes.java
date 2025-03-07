package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

/**
 * Special forms of while
 */

public class SpecialWhileTypes {

    public static void main(String[] args) {
        int i = 1;
        Scanner s = new Scanner(System.in);
        int num;

        while ((num = s.nextInt()) >= 0);


        while (i <= 0) {
            System.out.println("Never gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("Never gets in");

        }

        while (i <= 1) {
            System.out.println("One tim gets in");
            i++;
        }

        while (true) {
            System.out.println("Eternal loop");

        }



    }
}
