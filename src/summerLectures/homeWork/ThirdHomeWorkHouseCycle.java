package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/7/2016.
 */
public class ThirdHomeWorkHouseCycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apartment: ");
        int apartmnetn = input.nextInt();

        int porch = (apartmnetn - 1) / 36 + 1;
        int floor = (apartmnetn - 36 * (porch - 1) - 1) / 4 + 1;
        if (apartmnetn > 0 && apartmnetn < 145){
            System.out.println("porch: " + porch);

            System.out.println("floor: " + floor);
        }
        else {
            System.out.println("This apartment does not exist");
        }
        input.close();

    }
}
