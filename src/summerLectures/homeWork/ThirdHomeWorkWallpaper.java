package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/7/2016.
 */
public class ThirdHomeWorkWallpaper {
    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < row; j++) {
                if (j % 2 != 0) {
                    System.out.print("+++");
                }
                else {
                    System.out.print("***");
                }
            }
            System.out.println();

        }
    }
}
