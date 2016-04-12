package home.work.lecture4;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class AgeParser {
    public static void main(String[] args) {
        int age = 125;

        if ((age >=1) && (age <=120)){
            System.out.println("It is correct age");
        }else{
            throw new IllegalArgumentException("Incorrect age, please enter valid value");
        }
    }

}
