package gr.aueb.cf.lef.exes;

import java.util.Scanner;

public class Exe3App {
    public static void main(String[] args) {

        int num = 0;
        int square = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε αριθμό");

        num = s.nextInt();
        square = squareMethod(num);

        System.out.println(square);

    }

    public static int squareMethod(int num) {
        return  num * num;
    }
}
