package spring.work.lecture3;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/8/2016.
 */
public class SimpleAboutMeSample {
    public static void main(String[] args) {
        //input
        Scanner enter = new Scanner(System.in);
        //bl

        String myName;
        do {
            System.out.print("Enter your name; ");
            myName = enter.nextLine();
            if (!Objects.equals("Vova", myName)) {
                System.out.println("incorrect name");

            }
        } while (!Objects.equals("Vova", myName));

        System.out.print("Enter your surname: ");
        String mySurname = enter.nextLine();

        System.out.print("Enter your age: ");
        int myAge = enter.nextInt();

        System.out.println("I'm " + myName + " " + mySurname + ", " + myAge + " years old");

    }
}
