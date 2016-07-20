package summerLectures.homeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Velikiy on 10.07.2016.
 */
public class FourthHomeWorkArrayInteger {
    public static void main(String[] args) {
        System.out.println("Please enter size of array");
        Scanner input = new Scanner(System.in);
        int [] sizeArray = new int[input.nextInt()];

        for (int i = 0;i < sizeArray.length; i++) {
            sizeArray [i] = i+1;
            System.out.print(sizeArray[i] + "; ");
        }
        System.out.println(Arrays.toString(sizeArray) + "array value");


    }
}
