package summerLectures.lessons5;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/12/2016.
 */
public class Method {
    public static void main(String[] args) {
        System.out.println("Enter text");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int b = countLetter(text, 'l');
        printStatistic(text);
    }

    static int countLetter(String text, char letter) {
        int count = 0;

        for (char let : text.toCharArray()) {
            if (let == letter) {
                ++count;
            }
        }
        return count;
    }
    static void printStatistic(String text) {
        text = text.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            int count = countLetter(text, letter);
            if (count > 0) {
                System.out.println(letter + " - " + count);
            }
        }
    }
}


