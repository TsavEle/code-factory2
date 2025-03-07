package gr.aueb.cf.lef.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Copies line by line to a new file.
 */

public class BufferedReaderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Lefteris\\Documents\\bf-read.txt"))) {
            String line = " ";
            while ((line = bf.readLine() ) != null) {
                sb.append(line).append("\n"); // me to append (methodos tou stringbuilder) prosthetw sto telos tou stringbuilder
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println(sb);
    }
}
