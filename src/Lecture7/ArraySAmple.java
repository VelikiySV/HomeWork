package Lecture7;

import java.util.Arrays;

/**
 * Created by Volodymyr_Silitskyi on 4/19/2016.
 */
public class ArraySAmple {
    public static void main(String[] args) {
        int[] a = new int [3];
        int[] b = a;
        //int[] b = Arrays.copyOf(a, a.length);

        b[0] = 100;

        System.out.println(a[0]);
        //System.out.println(Arrays.equals(a, b));
    }
}
