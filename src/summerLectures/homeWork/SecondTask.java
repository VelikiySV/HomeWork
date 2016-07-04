package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/4/2016.
 */
public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Please enter parameters for triangle ");
        Scanner input = new Scanner(System.in);

        double side1 = input.nextDouble();
        System.out.println("Please enter for second side some parameter");
        double side2 = input.nextDouble();
        System.out.println("Please enter for third side parameter");
        double side3 = input.nextDouble();

        double formula = (side1+side2+side3)/2;
        double square = Math.sqrt(formula*(formula-side1)*(formula-side2)*(formula-side3));

        System.out.println("The square of triangle is - " + square);

        input.close();
    }
}
