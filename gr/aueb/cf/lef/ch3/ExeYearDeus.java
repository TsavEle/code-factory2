package gr.aueb.cf.lef.ch3;
/**
 * Δέχεται ένα έτος από το χρήστη
 * Ελέγχει εάν είναι δίσεκτο το έτος
 * Εκτυπώνει το κατάλληλο αποτέλεσμα
 */

import java.util.Scanner;

public class ExeYearDeus {

    public static void main(String[] args) {

        int year;
        System.out.println("Πληκτρολογήστε το έτος");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();

        if (year >= 400 && year % 400 == 0){
            System.out.println("Το έτος είναι δίσεκτο");}
        else if (year < 400 && year % 4 == 0) {
            if (year % 100 == 0){
                System.out.println("Το έτος δεν είναι δίσεκτο");}
            else {
                System.out.println("Το έτος είναι δίσεκτο");}

        }
        else {
            System.out.println("Το έτος δεν είναι δίσεκτο");}


    }
}
