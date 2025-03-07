package gr.aueb.cf.lef.exes;

import java.util.Scanner;

/**
 * Simple encryption
 */
public class ExeStrings1 {

    public static void main(String[] args) {
        int key = 1;

        System.out.println("Please insert the message you want to encrypt");

        Scanner s = new Scanner(System.in);
        String message = "";

        message = s.nextLine();

        char[] chars = message.toCharArray();
        char[] encrypted = encrypt(chars);
        System.out.println("Encrypted message is:");

        for (int i = 0; i < encrypted.length; i++) {
            System.out.print(encrypted[i]);
        }

        System.out.println();

        char[] decrypted = decrypt(encrypted);
        System.out.println("This is the decrypted message:");

        for (int i = 0; i < decrypted.length; i++) {
            System.out.print(decrypted[i]);
        }

    }

    public static char[] encrypt (char[] chars){
        final int key = 1;
        char[] encrypted = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            chars[i] += key;
            encrypted[i] = chars[i];
        } return encrypted;
    }

    public static char[] decrypt (char[] encrypted) {
        final int key = 1;
        char[] decrypted = new char[encrypted.length];

        for (int i = 0; i < encrypted.length; i++) {
            encrypted[i] -= key;
            decrypted[i] = encrypted[i];
        } return decrypted;
    }
}
