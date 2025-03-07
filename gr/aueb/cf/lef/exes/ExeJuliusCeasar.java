package gr.aueb.cf.lef.exes;

import java.util.Scanner;

/**
 * Ecnrypts and decrypts text in Julius Ceasar method.
 */
public class ExeJuliusCeasar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please insert the message you want to encrypt");
        String message = s.nextLine();

        char[] messages = message.toCharArray();

        char[] encrypted = encrypt(messages);
        System.out.println("The encrypted message is");

        for (int i = 0; i < encrypted.length; i++) {
            System.out.print(encrypted[i]);
        }
        System.out.println();

        System.out.println("Do you want to decrypt the message?");

        String choice = "yes";
        String response = s.nextLine();

        boolean outcome = choice.equals(response);

        if (outcome) {
            char[] decrypted = decrypt(encrypted);
            System.out.println("The decrypted message is: ");

            for (int i = 0; i < decrypted.length; i++) {
                System.out.print(decrypted[i]);
            }
        }

    }

    public static char[] encrypt(char[] messages) {
        final int key = 3;

        char[] encrypted = new char[messages.length];

        for (int i = 0; i < messages.length; i++) {
            encrypted[i] = (char) (messages[i] + key);

        } return encrypted;
    }

    public static char[] decrypt(char[] encrypted) {
        final int key = 3;

        char[] decrypted = new char[encrypted.length];

        for (int i = 0; i < encrypted.length; i++) {
            decrypted[i] = (char) (encrypted[i] - key);
        } return decrypted;
    }
}
