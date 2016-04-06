package home.work.lecture3;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/4/2016.
 */
public class HomeWorkL3 {
    public static void main(String[] args) {
//        String string = "Hello, World";
//
//        System.out.println(string.charAt(12));
//        System.out.println(string.length());
//        System.out.println(string.contains("or"));

        Scanner scanner =  new Scanner(System.in);
        String name = scanner.next();
        int age = Integer.parseInt(scanner.next());

        String ageString = Integer.toString(age);
        System.out.println("Hello. My name is " + name + ". I'm " + ageString + "years old");
    }
}

