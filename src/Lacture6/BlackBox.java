package Lacture6;

/**
 * Created by Volodymyr_Silitskyi on 4/14/2016.
 */
public class BlackBox {
    public static void main(String[] args) {
//        //input
        int from = 1;
        int to = 100;

        int rangeSum = rangeSum(from, to);
        System.out.println(rangeSum);
    }
        //BL

        public static int rangeSum(int from, int to) {
            int rangeSum = 0;
            for (int i = from; i <= to; i++) {
                rangeSum += i;
         }
         return rangeSum;
     }
}