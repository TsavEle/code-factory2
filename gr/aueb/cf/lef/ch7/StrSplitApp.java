package gr.aueb.cf.lef.ch7;

public class StrSplitApp {

    public static void main(String[] args) {
        String s = "Athens Uni   of  Economics and      Business";

        String[] tokens = s.split("\\s+"); // κάνε split ένα ή περισότερρα irregular spaces

        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}
