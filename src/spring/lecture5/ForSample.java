package spring.lecture5;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class ForSample {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }

    }

}
