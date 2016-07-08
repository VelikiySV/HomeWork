package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/6/2016.
 */
public class ThirdHomeWorkHouseSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter number of apartment ");
        Scanner input = new Scanner(System.in);
        int apartmentNum = input.nextInt();

        String porch;
        switch (apartmentNum){
            case 1:
            case 2:
            case 3:
            case 4:
                porch="1 porch, 1 floor";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                porch="1 porch, 2 floor";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                porch="1 porch, 3 floor";
                break;
            default:
                porch= "No apartment";
        }
        System.out.println(apartmentNum + " apartment in " + porch);
    }
}
