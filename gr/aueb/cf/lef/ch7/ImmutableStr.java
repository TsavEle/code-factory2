package gr.aueb.cf.lef.ch7;

public class ImmutableStr {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory"; // s1 remains unchangeable
        s1 = "Athens";
    }
}
