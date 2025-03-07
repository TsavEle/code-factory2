package gr.aueb.cf.lef.ch4;

/**
 * Prints chars.
 */
public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'B';

        System.out.println("char: " + ch1 + " ordinal " + (int) ch1);
        System.out.println("char: " + ch2 + " ordinal " + (int) ch2);

        System.out.printf("Char: %c, Ordinal: %d\n", ch1, (int) ch2);

    }
}
