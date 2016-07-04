package summerLectures.homeWork;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/4/2016.
 */
public class ThirdTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter circle radius");

        double rad = input.nextDouble();
        double formula = 2* Math.PI*rad;

        System.out.println("Circle radius is - " + formula);

        input.close();
    }
}
