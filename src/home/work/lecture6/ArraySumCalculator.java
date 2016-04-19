package home.work.lecture6;

/**
 * Created by Volodymyr_Silitskyi on 4/19/2016.
 */
public class ArraySumCalculator {
    public static void main(String[] args) {
        int array[] = {-3, 5, -5, 12};
        int sum = 0;

        sum = sumArray(array, sum);
        System.out.println(sum);
    }

    private static int sumArray(int[] array, int sum) {
        for (int anArray : array) {
            sum = sum + anArray;
        }
        return sum;
    }
}
