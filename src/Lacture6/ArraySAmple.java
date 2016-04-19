package Lacture6;

import java.util.Arrays;

/**
 * Created by Volodymyr_Silitskyi on 4/14/2016.
 */
public class ArraySAmple {
    public static void main(String[] args) {
        int [] a = new int [4];
        a [1] = 10;
        int [] b = {2, 4, 7, 2};

        System.out.println(a[3]);
        System.out.println(Arrays.toString(a));
        System.out.println(b.length);

        int sum = sum(b);
        System.out.println(sum);
    }

    private static int sum(int[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            int elem = b[i];
            sum += elem;
        }
        return sum;
    }

}
