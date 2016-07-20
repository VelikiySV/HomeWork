package summerLectures.lessons6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 7/14/2016.
 */
public class DateFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat sdfOne = new SimpleDateFormat("dd:MM:yyyy");
        System.out.println("Please enter date in format dd:MM:yyyy");
        String dataText = input.nextLine();

        try {
            date = sdfOne.parse(dataText);

        } catch (ParseException e) {
            System.out.println(e);
        }
        SimpleDateFormat sdfTwo = new SimpleDateFormat("dd:MMMM:yyyy");
        String text = sdfTwo.format(date);
        System.out.println(text);
        System.out.println(date.getTime());
        input.close();
    }
}
