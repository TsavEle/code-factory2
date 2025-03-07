package gr.aueb.cf.lef.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:\\Users\\Lefteris\\Documents\\file7.txt"); // eisagwgh arxeiou
        File outFd = new File("C:\\Users\\Lefteris\\Documents\\file7-out.txt"); // eksodos arxeiou (dhmiourgia)
        String line;
        String [] tokens;

        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token.trim() + " "); //το trim αφαιρει τα κενα αριστερα και δεξια. Παντα τριμμαρω οταν δεχομαι αρχεια απο χρηστη.
                    ps.printf("%s ", token);
                    ps.flush(); // Kanoume flush ton buffer (den perimenoume na gemisei gia na dwsei output)
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
