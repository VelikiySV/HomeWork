package spring.lecture5;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 9;
        int n;
        do {
            System.out.println("Please enter number ");
            n = scanner.nextInt();

            sum += n;
        } while (n != 0);


    System.out.println("sum = "+sum);
}
//        if (i != 0) {
//            System.out.println("Please enter some number ");
//            String sum = scanner.next();


}
