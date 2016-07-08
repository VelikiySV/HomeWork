package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/5/2016.
 */
public class Second {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s = Integer.toString(input.nextInt());

        String[] arr = s.split("");

        for (String anArr : arr) {
            System.out.println(anArr);
        }
    }
}
