package summerLectures.lessons7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/19/2016.
 */
public class ReadFromFile {
    public static void main(String[] args) {
String text = loadFromFile("src/summerLectures/lessons7/ReadFromFile.java");
        System.out.println(text);
    }

    static String loadFromFile(String fileAdress) {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileAdress);
        try (Scanner input = new Scanner(file)) {

            for (; input.hasNextLine(); ) {
                sb.append(input.nextLine());
                sb.append(System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        return sb.toString();
    }
}
