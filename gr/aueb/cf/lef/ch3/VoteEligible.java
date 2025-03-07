package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

/**
 *Is checking if user can vote
 */
public class VoteEligible {

    public static void main(String[] args) {

        int age = 0;
        Scanner s = new Scanner(System.in);
        final int VOTING_AGE = 18;
        boolean isEligible = false;

        System.out.println("Πληκτρολογήστε την ηλικία σας");

        age = s.nextInt();
        isEligible = age >= VOTING_AGE;

        System.out.printf("Your age is eligible for voting: %b" , isEligible);



    }
}
