/**
 * Created by Velikiy on 03.04.2016.
 */
public class TypesOfData {
    //https://ru.wikibooks.org/wiki/Java/%D0%A2%D0%B8%D0%BF%D1%8B_%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85
    static byte b = 5; // 8 bit (from -128 to 127)
    static short s = 8; // 16 bit (from -32768 to 32767)
    static char c = 90; // 16 bit (from 0 to 65535)
    static int i = 90; // 32 bit (from -2147483648 to 2147483647)
    static long l = 100; // 64 bit (from -9223372036854775808 to 9223372036854775807)

    static float f = 2.5f; // 32 bit (from -1.4e-45f to 3.4e+38f)
    static double d = 3.6; // 64 bit (from -4.9e-324 to 1.7e+308)

    static boolean boo = true;
    static boolean boo2 = false;

    public static void main(String[] args) {
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("char: " + c);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("true:" + boo);
        System.out.println("false:" + boo2);
    }
}
