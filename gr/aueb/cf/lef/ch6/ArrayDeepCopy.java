package gr.aueb.cf.lef.ch6;

import java.util.Arrays;

/**
 * Makes a DEEP copy of array with method
 */

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1,3,8,9,14};
        int[] copied = arrDeepCopy(arr);

        for (int el : copied) {
            System.out.print(el + " ");
        }

    }

    /**
     * It creates a fresh copy of array
     * @param source the source array
     * @return the copied array
     */

    public static int[] arrDeepCopy (int[] source) {
        int[] destination = new int[source.length];

//        for (int i = 0; i < source.length; i++){
//            destination[i] = source[i];
//        }

        System.arraycopy(source,0,destination,0,source.length); // Αντιγραφή του πίνακα με System.arraycopy
        destination = Arrays.copyOf(source, source.length);


        return destination;
    }
}
