package gr.aueb.cf.lef.ch10;

import java.util.Scanner;

/**
 * Transforms to AtHeNs
 * evens are Uppercase
 * singles are Lowercase
 */
public class UpperLowerCaseApp {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String message = s.nextLine();
        StringBuilder sb = new StringBuilder();
        String subStr;
        String s1;

        for (int i = 0; i < message.length(); i++) {
            subStr = message.substring(i, i+1);
            s1 = (i % 2 == 0) ? subStr.toUpperCase() : subStr.toLowerCase();
            sb.append(s1);

        }
        System.out.println(sb);
    }
}

