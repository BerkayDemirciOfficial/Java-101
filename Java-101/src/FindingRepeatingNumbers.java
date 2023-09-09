
import java.util.ArrayList;

public class FindingRepeatingNumbers {

    static boolean isFinding(int[] array, int value) {

        for (int i : array) {

            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int array[] = {3, 4, 16, 8, 3, 26, 91, 26, 8, 16, 6, 7, 17};

        int array2[] = new int[array.length];

        int start = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if ((i != j) && array[i] == array[j]) {

                    if (!isFinding(array2, array[i])) {
                        array2[start++] = array[i];
                    }
                    break;
                }
            }
        }

        for (int value : array2) {
            if ((value != 0) && (value % 2 == 0)) {
                System.out.println(value);
            }
        }

    }
}
