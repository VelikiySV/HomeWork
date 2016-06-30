package spring.work.lecture3;


import java.text.DecimalFormat;

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
//
//        Scanner scanner =  new Scanner(System.in);
//        String name = scanner.next();
//        int age = Integer.parseInt(scanner.next());
//
//        String ageString = Integer.toString(age);
//        System.out.println("Hello. My name is " + name + ". I'm " + ageString + " years old");

//        String s =  "Hello";
//        char c = s.charAt(s.length());
//
//          System.out.println(c);

//        System.out.println(10 + 10 + "Hello, World!" + 10 + 10);
        DecimalFormat decform = new DecimalFormat("0.0");

        int x = 45;
        int y = 32;
        double d1 = 1.0E+30;
        double d2 = 1.0E+27;

        double power = Math.pow(d1, d2);

        System.out.println(decform.format((x * d1) + (y * d2)));

    }
}




