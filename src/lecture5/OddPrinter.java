package lecture5;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class OddPrinter {
    public static void main(String[] args) {
        int from = 1;
        int to = 10;

        if (from > to){
            int temp = from;
            from = to;
            to = temp;
        }
        if (from % 2 != 0) {
            from++;
        }
            for (int i = from; i <= to; i += 2) {
                System.out.println(i);
            }
        }
    }
// int a, b;
//a = a + b;
//b = a- b;
//a = a - b;
//
//a = a^ b;
//b = a ^ b;
//a = a ^ b;
