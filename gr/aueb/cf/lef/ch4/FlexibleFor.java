package gr.aueb.cf.lef.ch4;

import java.util.Scanner;

public class FlexibleFor {

    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step;
        Scanner s = new Scanner(System.in);
        int iterations = 0;

        System.out.println("Please enter start, end, step");
        startVal = s.nextInt();
        endVal = s.nextInt();
        step = s.nextInt();

        for (int i = startVal; i <= endVal; i += step) {
            iterations++;
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println("Iteration: " + iterations);

    }
}
