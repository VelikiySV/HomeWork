package lecture5;

/**
 * Created by Volodymyr_Silitskyi on 4/14/2016.
 */
public class SumFrom1To1000 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
