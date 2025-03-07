package gr.aueb.cf.lef.exes;

import java.util.Scanner;

public class Exe1App {

    public static void main(String[] args) {
        int n = 0;
        int choice = 0;
        Scanner s = new Scanner(System.in);


        do {
            printMenu();
            System.out.println("Δώσε επιλογή: ");
            choice = s.nextInt();

            if (choice == 6) break;

            while (! checkChoice(choice)) {

                System.out.println("Η επιλογή πρέπει να είναι από 1 έως 6");
                System.out.println("Δώσε επιλογή: ");
                choice = s.nextInt();
            }

            System.out.println("Δώσε αριθμό για αστεράκια");
            n = s.nextInt();
            doChoice(choice, n);

        } while (choice != 6);

        System.out.println("Έξοδος");


    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος");
        return;
    }

    public static void doChoice(int choice, int n) {
        int i = 1;
        int j = 1;
        switch (choice) {
            case 1:
                for (i = 1; i <= n; i++) {
                    printStars1(n, i);
                }
                System.out.println();
                break;
            case 2:
                for (i = 1; i <= n; i++) {
                    printStars2(n, i);
                }
                break;
            case 3:
                do{
                    for (i = 1; i <= n; i++){
                        printStars1(n, i);
                    }
                    System.out.println();
                    j++;
                } while (j <= n);
                break;
            case 4:
                for (i = 1; i <= n; i++) {
                    for (j = 1; j <= i; j++){
                        printStars1(n, i);
                    }
                    System.out.println();
            } break;
            case 5:
                for (i = 1; i <= n; i++) {
                    for (j = n; j >= i; j--) {
                        printStars1(n, i);
                    }
                    System.out.println();
                }break;
        }
    }

    public static boolean checkChoice(int choice) {
        return choice >= 1 && choice <= 6;

    }

    public static void printStars1(int n, int i) {

        for (i = 0; i <= n; i++) {
            System.out.print("*");
            return;
        }
    }

    public static void printStars2(int n, int i) {

            for ( i = 0; i <= n; i++){
                System.out.println("*");
                return;
            }
    }



}
