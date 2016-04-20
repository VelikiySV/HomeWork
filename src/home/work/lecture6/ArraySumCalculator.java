package home.work.lecture6;

/**
 * Created by Volodymyr_Silitskyi on 4/19/2016.
 */
public class ArraySumCalculator {
    public static void main(String[] args) {
        int array[] = {-3, 5, -5, 12};

        System.out.println(sumArray(array));
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int anArray : array) {
            sum = sum + anArray;
        }
        return sum;
    }
}
