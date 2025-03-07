package gr.aueb.cf.lef.ch2;

import java.util.Scanner;

/**
 * Εκτυπώνει το άθροισμα των ψηφίων ενός διψήφιου ακεραίου
 */

public class DigitSum {

    public static void main(String[] args) {

        int num;
        int sum;

        System.out.println("Πληκτρολογήστε έναν διψήφιο αριθμό");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        sum = (num/10) + (num%10);
        System.out.println("Το άθροισμα των ψηφίων είναι" + sum);



    }
}
