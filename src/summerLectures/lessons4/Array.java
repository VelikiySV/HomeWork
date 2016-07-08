package summerLectures.lessons4;

import java.util.Arrays;

/**
 * Created by Volodymyr_Silitskyi on 7/7/2016.
 */
public class Array {
    public static void main(String[] args) {
        double [] array = new double [12];
        for (int i = 0; i < array.length; i++) {
            array[i] = 5000 * Math.random() + 5000;
        }
        System.out.println(Arrays.toString(array));

        double sum = 0;

        for (double d : array) {
            sum += d;
        }
        sum = sum / array.length;
        System.out.println(sum);
    }
}
