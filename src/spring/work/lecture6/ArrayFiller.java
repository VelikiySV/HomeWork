package spring.work.lecture6;

import java.util.Arrays;

/**
 * Created by Volodymyr_Silitskyi on 4/19/2016.
 */
public class ArrayFiller {
    public static void main(String[] args) {
        int[] array = new int[1];
        fill(array, 55);
        System.out.println(Arrays.toString(array));
    }

    public static void fill(int [] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
//    public static void fill(int[] arrray, int min, int max) {
//        Random random = new Random();
//        for (int i = 0; i < arrray.length; i++) {
//            arrray[i] = min + random.nextInt(max - min + 1);
//        }
//    }