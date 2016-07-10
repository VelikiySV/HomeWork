package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Velikiy on 10.07.2016.
 */
public class FourthHomeWorkArrayInteger {
    public static void main(String[] args) {
        System.out.println("Please enter size of array");
        Scanner input = new Scanner(System.in);
        int [] sizeArray = new int[input.nextInt()];

        for (int i = 0;i <= sizeArray.length; i++) {
            sizeArray [i] = i;
            System.out.println(sizeArray[i]);
        }
    }
}
