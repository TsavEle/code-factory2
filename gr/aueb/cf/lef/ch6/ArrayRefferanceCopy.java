package gr.aueb.cf.lef.ch6;

/**
 * Copies the referance of the array
 * it is a shallow copy
 * In shallow copies there are sideeffects
 */

public class ArrayRefferanceCopy {

    public static void main(String[] args) {

        int[] arr = {1,3,8,9,12};
        int[] arrRefCopy = arr;  // Shallow copy

        for (int el : arrRefCopy) { // Epivevaiwsh
            System.out.print(el + " ");
        }

        arrRefCopy[4] = 100; //Logo shallow copy allazoun kai oi times tou arr

        for (int el : arr) {
            System.out.println(el + " ");
        }
    }

}
