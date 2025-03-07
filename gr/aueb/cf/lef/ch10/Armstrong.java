package gr.aueb.cf.lef.ch10;

import java.util.Scanner;

/**
 * 153 = 1^3 + 5^3 + 3^3 if = 153 then 153 is Armstrong.
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        int sum = 0;
        int numberOfDigits;
        int originalNum;
        int digit;

        System.out.println("Please insert a number (integer)");
        num = s.nextInt();
        numberOfDigits = String.valueOf(num).length(); //.valueOf transforms a primitive to String έπειτα η .length εισχωρει αλυσηδωτα στο numberOfDigits το μήκος του String.
        originalNum = num;
 
        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum) ? " is " : " is not ");
    }
}
