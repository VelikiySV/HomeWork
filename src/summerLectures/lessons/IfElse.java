package summerLectures.lessons;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/5/2016.
 */
public class IfElse {
    public static void main(String[] args) {
        System.out.println("Please enter some number");
        Scanner input = new Scanner(System.in);
        int max;

        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();


        MaxNum(firstNum, secondNum, thirdNum);
        input.close();
    }

    private static void MaxNum(int firstNum, int secondNum, int thirdNum) {
        int max;
        if (firstNum > secondNum) {
            max = firstNum;
            System.out.println(max);
        } else if (firstNum > thirdNum) {
            max = secondNum;
            System.out.println(max);
        } else if (secondNum > thirdNum) {
            max = thirdNum;
            System.out.println(max);
        }
    }
}
