package spring.Lecture8;

import java.util.Arrays;

/**
 * Created by Volodymyr_Silitskyi on 4/21/2016.
 */
public class RevertArray {
        public static void main(String[] args) {
            int[] revert = {6, 5, 8, 12, 4};
            revertArray(revert);
            System.out.println(Arrays.toString(revert));

        }


    public static int[] reverse ( int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int t;
            t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        return arr;
    }

    private static void revertArray(int[] revert) {
        for (int i = 0; revert.length/2 > i; i++) {
            int array = revert[i];
            revert[i] = revert[revert.length - i - 1];
            revert[revert.length - i - 1] = array;
        }
    }
}