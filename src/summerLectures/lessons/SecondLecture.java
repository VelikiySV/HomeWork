package summerLectures.lessons;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 6/30/2016.
 */
public class SecondLecture {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double fullPrice = 24.75;
        double fuilR = 7.5;
        System.out.println("Input r and press Enter");
        double r = sc.nextDouble();
        double totalSum = fuilR / 100 * fullPrice * r * 2;

        System.out.println(totalSum + "UAH");
        sc.close();
    }
}
