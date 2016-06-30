package spring.work.lecture3;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/8/2016.
 */
public class DifferentRadiaxSummator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter X in Bin: ");
        String x = number.next();
        int numX = Integer.parseInt(x, 2);

        System.out.println("Enter Y in Oct: ");
        String y = number.next();
        int numY = Integer.parseInt(y, 8);

        System.out.println("Enter Z in Hex: ");
        String z = number.next();
        int numZ = Integer.parseInt(z, 16);

        int result = numX + numY + numZ;
        System.out.println("X + Y + Z = " + result);
    }
}
