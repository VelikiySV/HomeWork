package Lecture8;

/**
 * Created by Volodymyr_Silitskyi on 4/21/2016.
 */
public class DisplayedNumbers {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int n = 5;

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
//public static void main(String[] args) {
//    DisplayedNumber(5, 10, 20);
//}
//public static void DisplayedNumber (int count, int a, int b) {
//    if (count < 0){
//        throw new IllegalArgumentException("Incorrect count");
//    }
//
//    for (int i = 0; i < count; i++) {
//        if (i % 2 == 0){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//    }
//}

}
