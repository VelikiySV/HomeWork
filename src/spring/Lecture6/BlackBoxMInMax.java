package spring.Lecture6;

/**
 * Created by Volodymyr_Silitskyi on 4/14/2016.
 */
public class BlackBoxMInMax {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int min = min(a, b);
        int max = max(a, b);
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }


    public static int min(int a, int b) {
        int min = (a < b) ? a : b;
        return min;
    }

    public static int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }
}