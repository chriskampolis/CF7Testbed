package gr.aueb.cf.ch6;

/**
 * Replaces (update) an element of the table
 * with another
 */
public class ReplaceElementApp {

    public static void main(String[] args) {

    }

    public static void replace (int[] arr, int oldVal, int newVal) {
        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldVal);

        if(positionToUpdate == -1) {
            return;                         // Because of 'return' no need for 'else'
        }

        arr[positionToUpdate] = newVal;
    }



    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }
}
