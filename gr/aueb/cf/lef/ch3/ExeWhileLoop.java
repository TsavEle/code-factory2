package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

public class ExeWhileLoop {

    public static void main(String[] args) {

        int num;
        System.out.println("Δώστε ακέραιο αριθμό");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();


            while (num != 5) {
                if (num <= 0 || num>5) {
                    System.out.println("Δώστε έναν αριθμό από 1 έως 5");
                    num = s.nextInt();
                } else if (num == 1) {
                    System.out.println("Εισαγωγή");
                    num = s.nextInt();
                } else if (num == 2) {
                    System.out.println("Διαγραφή");
                    num = s.nextInt();
                } else if (num == 3) {
                    System.out.println("Ενημέρωση");
                    num = s.nextInt();
                } else  {
                    System.out.println("Αναζήτηση");
                    num = s.nextInt();
                }
            }

            System.out.println("Έξοδος");










    }
}
