package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/4/2016.
 */
public class FirstTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five numbers");
        int num = input.nextInt();

        System.out.println("The result is:");
        int firstNum = num / 10000;
        System.out.println(firstNum);

        int secondNum = num / 1000 % 10;
        System.out.println(secondNum);

        int thirdNum = num / 100 % 10;
        System.out.println(thirdNum);

        int fourthNum = num / 10 % 10;
        System.out.println(fourthNum);

        int fifthNum = num % 10;
        System.out.println(fifthNum);

        input.close();
    }
}
