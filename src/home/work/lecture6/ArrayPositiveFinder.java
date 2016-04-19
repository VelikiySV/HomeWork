package home.work.lecture6;

/**
 * Created by Volodymyr_Silitskyi on 4/19/2016.
 */
public class ArrayPositiveFinder {
    public static void main(String[] args) {

        int [] array = new int[] {-30, -21, -2, 2, -50, -1, -2, 3};
        int firstPositive = findFirstPositive(array);

        if (firstPositive == 0){
            System.out.println(-1);
        }
        else{
            findLastPositive(array);
        }

    }


    private static int findFirstPositive(int[] array) {
        int first = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                first = array[i];
                System.out.println("First positive value is " + first);
                break;
            }
        }
        return first;
    }

    private static void findLastPositive(int[] array) {
        int last = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                last = array[i];
                System.out.println("Last positive value is " + last);
                break;
            }
        }
    }
}