package gr.aueb.cf.lef.ch10;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int s1 = 0;
        int s2 = 0;
        s1 = in.nextInt();
        s2 = in.nextInt();
        try {
            deposit(s1);
        } catch (Exception ex) {
            System.out.println("An error happened. Try again.");
        }

        try {
            withdraw(s2);
        } catch (Exception ex) {
            System.out.println("An error happened. Try again. ");
        }
        System.out.println("Your new balance is: " + balance);

    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount); // log
        } catch (Exception ex) {
            System.err.println("Error. " + ex.getMessage()); // log
            throw ex;
        }
    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Amount must be less or equal than balance.");
            }
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount); // log
        } catch (Exception ex) {
            System.err.println("Error. " + ex.getMessage()); // log
            throw ex;
        }
    }
}
