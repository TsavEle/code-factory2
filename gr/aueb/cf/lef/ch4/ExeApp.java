package gr.aueb.cf.lef.ch4;

import java.util.Scanner;

/**
 * Prints the stars given by user in a certain pattern
 * 1.n horizontal
 * 2. kathera
 * 3. nxn
 * 4. from 1 to n.
 * 5. from n to 1
 */

public class ExeApp {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Please insert number of stars");
        n = s.nextInt();

        while (i < n) {
            System.out.print("*");
            i++;
        }

    }
}
