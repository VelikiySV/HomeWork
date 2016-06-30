package spring.work.lecture3;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/8/2016.
 */
public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        String pattern = "$(name)";

        String newMessage = message.replace(pattern, name);

        System.out.println(newMessage);

    }
}
