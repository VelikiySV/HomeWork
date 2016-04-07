package home.work.lecture1;

/**
 * Created by Volodymyr_Silitskyi on 3/30/2016.
 */
public class MyFirstClass {

    static String name = "Vova";
    static int age = 25;

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("My name " + name + " and i'm " + age);

        System.out.print(myName());
    }

    public static String myName () {
        name = "newVova";

        return "It is method: My name " + name + " and i'm " + age;

    }

}


