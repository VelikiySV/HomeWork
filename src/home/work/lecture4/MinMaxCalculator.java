package home.work.lecture4;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class MinMaxCalculator {
//    public static void main(String[] args) {
//        // input
//        int a = 9;
//        int b = 6;
//
//        if (a > b){
//            System.out.println("Max is " + a);
//        }
//    else{
//            System.out.println("Min is " + b);
//        }
//    }

    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        int min;  //int min = (a < b) ? a : b;
        int max; // int max = (a > b) ? a : b;
        if (a < b) {
            min = a;
            max = b;
        }else{
            min = b;
            max = a;
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}


