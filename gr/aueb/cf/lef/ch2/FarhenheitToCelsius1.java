package gr.aueb.cf.lef.ch2;

import java.util.Scanner;

public class FarhenheitToCelsius1 {

    public static void main(String[] args) {

        int f ;
        System.out.println("Enter Fahrenheit degrees");
        Scanner s = new Scanner(System.in);
        f = s.nextInt();


        int celsius = 5*(f -32)/9;
        System.out.println("H θερμοκρασία σε βαθμους κελσίου ειναι" + " " + celsius);
        s.close();


    }
}
