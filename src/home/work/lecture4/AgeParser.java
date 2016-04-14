package home.work.lecture4;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class AgeParser {
    public static void main(String[] args) {
        System.out.println("Please enter your age " );
        Scanner scanner = new Scanner(System.in);
        String age = scanner.next();
        int parsAge = Integer.parseInt(age);

        if ((parsAge >=1) && (parsAge <=120)){
            System.out.println("It is correct age");
        }else{
            throw new IllegalArgumentException("Incorrect age, please enter valid value");
        }
    }

}
