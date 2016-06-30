package spring.work.lecture4;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class IsAgeChecker {
    public static void main(String[] args) {
        int age = 125;
        boolean myAge = true;
        boolean notMyAge = false;

        if ((age >= 1) && (age <= 120)){
            System.out.println(myAge);
        }else{
            System.out.println(notMyAge);
        }
    }
}

