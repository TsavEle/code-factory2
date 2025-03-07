package gr.aueb.cf.lef.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο δεδομένα
 */

public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:\\Users\\Lefteris\\Documents\\names.txt";
        String outFilePath = "C:\\Users\\Lefteris\\Documents\\names-formated.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
   //             ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
                printFormated(ps, tokens);
                printFormated(System.out, tokens);
            }

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void printFormated(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
    }
}
