package gr.aueb.cf.lef.ch3;

import java.util.Scanner;

/**
 * Snowing if raining && temp < 0
 */

public class SnowingApp {

    public static void main(String[] args) {

        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner s = new Scanner(System.in);
        int temp = 0;

        System.out.println("Please insert if it is raining");
        isRaining = s.nextBoolean();

        System.out.println("Please insert the temperature");
        temp = s.nextInt();

        isSnowing = isRaining && (temp<0);

        System.out.println("Is snowing: " + isSnowing);


    }
}
