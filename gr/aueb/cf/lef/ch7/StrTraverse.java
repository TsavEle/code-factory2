package gr.aueb.cf.lef.ch7;

/**
 * Traverses one-by-one all str characters.
 */
public class StrTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " " );
        }

        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--) { //Prints in reverse
            System.out.print(s.charAt(i) + " ");
        }

    }
}
