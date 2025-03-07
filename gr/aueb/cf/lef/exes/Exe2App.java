package gr.aueb.cf.lef.exes;

import java.util.Scanner;

public class Exe2App {

    public static void main(String[] args) {

        double cels = 0.0;
        double fahr = 0.0;
        Scanner s = new Scanner(System.in);


        System.out.println("Παρακαλώ εισάγετε τιμή Celsius");
        cels = s.nextDouble();

        fahr = celsiusToFahrenheit (cels,fahr);
        System.out.printf("%.2f ", fahr);
    }

    public static double celsiusToFahrenheit(double  cels,double farh) {
        return farh = (cels * 1.8) + 32;

    }
}
