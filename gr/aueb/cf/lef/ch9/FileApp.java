package gr.aueb.cf.lef.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("C:\\Users\\Lefteris\\Documents\\file7.txt");
        String line;
        String [] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token.trim() + " "); // το trim αφαιρει τα κενα αριστερα και δεξια. Παντα τριμμαρω οταν δεχομαι αρχεια απο χρηστη.
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
