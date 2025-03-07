package gr.aueb.cf.lef.ch4;

import java.util.Scanner;

public class ExeApp2 {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter number of stars");
        n = s.nextInt();

        while (i < n) {
            System.out.println("*");
            i++;
        }
    }
}
