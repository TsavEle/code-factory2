package gr.aueb.cf.lef.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/tmp/file.txt");

        try(Scanner in = new Scanner(file)) {
            char ch = (char) System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
            //throw ex;
        } catch (IOException ex) {
            System.err.println("IO Exception");
            //throw ex;
        } catch (Exception ex) {
            System.err.println("Generic error");
            ex.printStackTrace();
        }
    }
}
