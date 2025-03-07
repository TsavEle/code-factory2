package gr.aueb.cf.lef.ch2;

/**
 * Counts stepsup, distance down by one.
 */

public class CounterApp {

    public static void main(String[] args) {
        int steps = 0;
        int distance = 3;

        while (distance>0) {
            System.out.printf("Steps: %d, Distance: %d\n", steps++, distance--);
        }

    }
}
