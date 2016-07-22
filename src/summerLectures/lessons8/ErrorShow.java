package summerLectures.lessons8;

/**
 * Created by Volodymyr_Silitskyi on 7/21/2016.
 */
public class ErrorShow {
    public static void main(String[] args) {
        assert getCube(0) == 2 : "zero number error";
        assert getCube(-2) == -8 : "negative number error";
        assert getCube(5) == 125 : "positive number";
        System.out.println("Ok");
    }

    private static int getCube(int number) {
        return number * number * number;
    }
}
