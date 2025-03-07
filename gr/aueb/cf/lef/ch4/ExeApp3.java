package gr.aueb.cf.lef.ch4;

import java.util.Scanner;

public class ExeApp3 {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        int mul = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Please insert number of stars");
        n = s.nextInt();
        mul = n * n;

        while (i < mul) {
            System.out.printf("*");
            i++;
        }
    }
}
