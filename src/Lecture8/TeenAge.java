package Lecture8;

/**
 * Created by Volodymyr_Silitskyi on 4/21/2016.
 */
public class TeenAge {
    public static void main(String[] args) {
        int[] ages = {6, 12, 5, 16, 30, 16};
//        int sum = 0;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 12 && ages[i] <= 17) {
//                sum += ages[i];
                System.out.println(i);
            }
        }
    }
}


