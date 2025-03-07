package gr.aueb.cf.lef.ch6;

/**
 * Array search with method
 */
public class ArraySearchWithMethodsApp {

    public static void main(String[] args) {
        int[] arr = {-5,5,88,26,5};
        int position;

        position = getPosition(arr, -5);

        if (position == -1) {
            System.out.println("Failure");
        } else {
            System.out.printf("Value: %d, Position: %d", arr[position], (position + 1));
        }

    }

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }
}
