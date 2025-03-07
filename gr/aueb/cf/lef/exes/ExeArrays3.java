package gr.aueb.cf.lef.exes;

import java.util.Scanner;

public class ExeArrays3 {

    public static void main(String[] args) {
        System.out.println("Παρακαλώ εισάγετε 6 ακεραίους από το 1 έως το 49");

        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int s5 = s.nextInt();
        int s6 = s.nextInt();

        int[] arr = {s1, s2, s3, s4, s5, s6};

        if (lessThanThreeEvens(arr)){
            System.out.println("Ο πίνακας διαθέτει λιγότερους από τρείς άρτιους");
        } else System.out.println("Ο πίνακας διαθέτει τρείς ή περισότερους άρτιους");

        if (lessThanThreeOdds(arr)) {
            System.out.println("Ο πίνακας διαθέτει λιγότερους απο τρείς μονούς");
        } else System.out.println("Ο πίνακας διαθέτει τρείς ή περισότερους μονόυς");

        if (lessThanThreeConsecutives(arr)) {
            System.out.println("Ο πίνακας διαθέτει λιγότερους από τρείς συνεχόμενους αριθμούς");
        } else System.out.println("Ο πίνακας διαθέτει τρείς ή περισότερους συνεχόμενους αριθμούς");

        if (lessThanThreeSameEnding(arr)) {
            System.out.println("Ο πίνακας διαθέτει λιγότερους από τρείς με ίδια κατάλειξη αριθμούς");
        } else System.out.println("Ο πίνακας διαθέτει τρείς ή περισότερους με ίδια κατάλειξη αριθμούς");

        if (lessThanThreeSameDecade(arr)) {
            System.out.println("Ο πίνακας διαθέτει λιγότερους από τρείς αριθμόυς στην ίδια δεκάδα");
        } else System.out.println("Ο πίνακας διαθέτει τρείς ή περισότερους αριθμούς στην ίδια δεκάδα");



    }

    public static boolean lessThanThreeEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count < 3;
    }

    public static boolean lessThanThreeOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                count++;
            }
        } return count < 3;
    }

    public static boolean lessThanThreeConsecutives(int[] arr) {
         int count = 0;
         for(int i = 0; i <= 3; i++){
                 if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                     count++;
             }
         } return count < 3;
    }

    public static boolean lessThanThreeSameEnding(int[] arr) {
        int count = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] > 10) {
                arr[i] = arr[i] % 10;
            }
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[i] == arr[i + j]) {
                    count++;
                } if (count >= 3)
                    break;
            }
        } return count < 3;
    }

    public static boolean lessThanThreeSameDecade(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[i] / 10 == arr[i + j] / 10) {
                    count++;
                } if (count >= 3)
                    break;
            }
        } return count < 3;
    }
}
