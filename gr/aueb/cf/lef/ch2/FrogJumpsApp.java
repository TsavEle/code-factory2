package gr.aueb.cf.lef.ch2;

import java.util.Scanner;

/**
 * x = 10
 * y = 85
 * d = 30
 * Jumps = 3
 *
 *
 */

public class FrogJumpsApp {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int d = 0;
        int j = 0;

        System.out.println("Please insert starting position");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        System.out.println("Please insert final position");
        y = s.nextInt();
        System.out.println("Please insert jumping distance");
        d = s.nextInt();



        while(x<y){
            j++;
            x = d + x;
        }

        System.out.println("The jumps needed are:" + j);
    }





}
