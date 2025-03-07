package gr.aueb.cf.lef.exes;

import java.util.Arrays;
import java.util.Scanner;

public class ExeArrays4 {

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key;
        Scanner s = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε παράμετρο πίνακα για έλεγχο");
        key = s.nextInt();

        while (key < 0 || key > arr.length - 1){
            System.out.println("Παρακαλώ εισάγετε παράμετρο πίνακα για έλεγχο");
            key = s.nextInt();
        }

        int maxValue =getMaxValue(arr);

        int[] lowAndHighIndexOfInt = getLowAndHighIndexOfInt(arr, key, maxValue);

        System.out.println("Ο χαμηλός και υψηλός δείκτης της παραμέτρου πίνακα είναι : " + Arrays.toString(lowAndHighIndexOfInt));

    }

    public static int getMaxValue(int[] arr) {
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        } return maxValue;
    }

    public static int[] getLowAndHighIndexOfInt(int[] arr,int key, int maxValue) {
        int lowIndex = 0;
        int highIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowIndex = i;
                break;
            }
        }
        if (key == maxValue) {
            highIndex = arr.length -1;
            return new int[] {lowIndex,highIndex};
        } else {
            for (int i = lowIndex; i < arr.length; i++) {
                if (arr[lowIndex] < arr[i]) {
                    highIndex = i - 1;
                    break;
                }
            }
            return new int[] {lowIndex, highIndex};
        }

    }
}
