package at.work;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Volodymyr_Silitskyi on 4/26/2016.
 */
public class SplitString {
//    public static void main(String[] args) {
//        String[] split = "This method has two variants and splits this string around matches of the given regular expression".split(" ");
////        System.out.println(Arrays.toString(split));
//
//        for (int i = 0; i < split.length / 2; i++) {
//            swap(split, i, split.length - i - 1);
//        }
//        StringBuilder str = new StringBuilder();
//        for (String word : split) {
//            str.append(word).append(' ');
//        }
//        System.out.println(str);
//    }
//
//    public static void swap(String[] split, int i, int j) {
//        String temp = split[i];
//        split[i] = split[j];
//        split[j] = temp;
//    }

//    public static void main(String[] args) {
//        String[] split = "This method has two variants and splits this string around matches of the given regular expression".split(" ");
//
//        for (int i = 0; split.length/2 > i; i++) {
//            String tmp = split[i];
//            split[i] = split[split.length - i - 1];
//            split[split.length - i - 1] = tmp;
//        }
//        System.out.println(Arrays.toString(split));
//
//    }

    public static void main(String[] args) {
        int a [] = {5, 2, 6, 9,};

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[a.length - i - 1]);
        }
    }
}





