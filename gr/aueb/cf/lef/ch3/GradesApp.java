package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

/**
 * User inputs total grades of classes
 * User inputs the number of classes
 * Άριστα αν ο μεσος ορος => 9
 * Πολύ καλά αν ο μέσος όρος >=7
 * Καλός αν ο μέσος όρος >=5
 * Αν ο μέσος όρος < 5 fail
 */
public class GradesApp {

    public static void main(String[] args) {

        int classes_num = 0;
        int grade = 0;
        int grade_avg = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Please insert grade.");
        grade = s.nextInt();

        if (grade <= 0) {
            System.out.println("Grades must not be zero");
            System.exit(1);

        }

        System.out.println("Please insert number of classes");
        classes_num = s.nextInt();

        if (classes_num <= 0) {
            System.out.println("Classes must not be zero");
            System.exit(1);
        }

        grade_avg = grade / classes_num;

        if (grade_avg > 10) {
            System.out.println("Error, The average must be less or equal than 10");
            System.exit(1);
        }

        if (grade_avg >= 9) {
            System.out.println("Excellent");
        } else if (grade_avg >= 7) {
            System.out.println("Very good");
        } else if (grade_avg >= 5) {
            System.out.println("Good");
        } else System.out.println("Failure");

    }
}
