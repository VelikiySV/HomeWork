package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Velikiy on 10.07.2016.
 */
public class ThirdHomeWorkFactorial {
    public static void main(String[] args) {
        System.out.print("Please enter number between 4 and 16");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fac = 1;
        if (n > 4 && n < 16) {
            for (int i = 1; i <= n; i++) {
                fac *= i;

            }
            System.out.println(n +  "!n " + fac);
        }else{
            System.out.println("Wrong input");
        }input.close();
    }
}
