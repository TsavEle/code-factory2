package gr.aueb.cf.lef.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Reads a char as a byte.
 */
public class CharInApp {

    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner s =new Scanner(System.in);

        System.out.println("Enter a character");
//        ch =(char) System.in.read();
//        είναι UTF 16 άρα δεν μπορεί να διαβάσει ελληνικα

        ch = s.nextLine().charAt(0);
//        Διαβάζουμε όλους τους χαρακτήρες που δίνει ο χρήστης μέχρι να αλλάξουμε γραμμή
//        Στη συγκεκριμένη περίπτωση διαβάζει την πρώτη θέση αφου δώσαμε 0

        System.out.printf("%c", ch);
    }
}
