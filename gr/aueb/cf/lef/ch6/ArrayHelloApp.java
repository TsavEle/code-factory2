package gr.aueb.cf.lef.ch6;

public class ArrayHelloApp {
    public static void main(String[] args) {
        int[] arr = new int[3]; //declare and init

        // Populate
        arr [0] = 5;
        arr [1] = 4;
        arr [2] = 10;

        // traverse
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
