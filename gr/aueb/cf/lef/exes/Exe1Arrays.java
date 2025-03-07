package gr.aueb.cf.lef.exes;

import java.util.Random;
import java.util.Scanner;

public class Exe1Arrays {

    public static void main(String[] args) {


        int[] arr = {8,12,35,66,78,92,15,1,12,14};


        int secondLowest = getSecondLowest(arr);
        int maxPosition = getMaxPosition(arr);

        System.out.printf("second lowest: %d\n", secondLowest);
        System.out.printf("Max: %d\n", arr[maxPosition]);




    }

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        } return maxPosition;
    }

    public static int getSecondLowest(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int min1;
        int min2;
        if (arr[0] < arr[1]) {
            min1 = arr[0];
            min2 = arr[1];
        } else {
            min1 = arr[1];
            min2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] > min1) {
                min2 = arr[i];
            }
        }
        return min2;
    }
}
