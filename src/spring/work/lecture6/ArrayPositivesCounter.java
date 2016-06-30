package spring.work.lecture6;

/**
 * Created by Volodymyr_Silitskyi on 4/19/2016.
 */
public class ArrayPositivesCounter {
    public static void main(String[] args) {

        int [] array = new int[] {-30, -21, -2, 2, 50, -1, -2, 3};

        int firstPositive = findFirstPositive(array);

        System.out.println("Sum of positive value is " + firstPositive);
    }

    private static int findFirstPositive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
       // System.out.println("Sum of positive value is " + sum);
        return sum;
    }
}
