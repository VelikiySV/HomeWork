package home.work.lecture3;


import java.text.DecimalFormat;

/**
 * Created by Volodymyr_Silitskyi on 4/6/2016.
 */
public class MathClass {
    public static void main(String[] args) {
        double angle = 45;
        double angleInRadians = Math.toRadians(angle);
        double sin = Math.sin(angleInRadians);

        System.out.println(Math.round(sin));


        double a = 1 / Math.sqrt(2);

        System.out.println(Math.round(a));

        float f = 1.1f;

      System.out.println(Math.abs(45 * 10^30 + 32 * 10^27));

        System.out.println(1. / 0);

//
         DecimalFormat df2 = new DecimalFormat("0.00");

            int angles = 90;
            angleInRadians = Math.toRadians(angle);
            double sins = Math.sin(angleInRadians);

            System.out.println(df2.format(sin));


    }
}
