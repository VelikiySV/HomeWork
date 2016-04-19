package home.work.lecture6;

/**
 * Created by Volodymyr_Silitskyi on 4/19/2016.
 */
public class ArrayPositiveFinder {
    public static void main(String[] args) {
        int [] array = new int[] {-30, -21, -2, 2, -50, 1, -2, -3,};
        findFirstPositive(array);
        findLastPositive(array);
    }

    private static void findLastPositive(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                System.out.println("Last positive value is " + array[i]);
                break;
            }
        }
    }

    private static void findFirstPositive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("First positive value is " + array[i]);
                break;
            }
        }
    }

}