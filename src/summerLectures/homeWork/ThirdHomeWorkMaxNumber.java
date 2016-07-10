package summerLectures.homeWork;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/6/2016.
 */
public class ThirdHomeWorkMaxNumber {
    public static void main(String[] args) {
        System.out.println("Please enter four numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int max = num1;
//        int max2 = num3;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

//        if(num2>max){
//            max = num2;
//        }
//        if(num4>max2){
//            max2 = num4;
//        }
//        if (max>max2){
//            System.out.println(max);
//        }else{
        System.out.println("Max = " + max);

/*        if (num1 > num2) {
            max = num1;
            System.out.println("Max = " + max);
        }else if (num1>num3){
            max = num3;
            System.out.println("Max = " + max);
        }else if (num1>num4){
            max = num4;
            System.out.println("Max = " + max);
        }else if (num2>num3){
            max = num2;
            System.out.println("Max = " + max);
        }else if (num2>num4){
            max = num2;
            System.out.println("Max = " + max);
        }else if (num3>num4){
            max = num3;
            System.out.println("Max = " + max);
        }else if(num4>num3){
            max = num4;
            System.out.println("Max = " + max);
        }*/
        input.close();
    }
}
