package gr.aueb.cf.lef.exes;

import java.util.Arrays;

public class ExeArrays2 {

    public static void main(String[] args) {

        int[] arr = {5, 12, 6, 8, 155, 220, 136, 74};

        System.out.println(getPosition(arr,74));

        printEvens(arr);

        int[] arr2 = doubleArray(arr);
        System.out.println(Arrays.toString(arr2));
        
        System.out.println(onePositive(arr));

        System.out.println(allPositive(arr));

    }

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                positionToReturn = i;
                break;
            }
        }

     return positionToReturn;
    }

    public static void printEvens(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 == 0) System.out.println(arr[i]);
        }
    }

    public static int[] doubleArray(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * 2;
        }
        return arr2;
    }

    public static boolean onePositive(int[] arr) {
        boolean isThereOnePositive = false;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > 0) {
                isThereOnePositive = true;
                break;
            }
        }
        return isThereOnePositive;
    }

    public static boolean allPositive(int[] arr) {
        int numberOfPositives = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                numberOfPositives++;
            }
        }
        return numberOfPositives == arr.length;
    }
}
