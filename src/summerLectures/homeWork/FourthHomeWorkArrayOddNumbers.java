package summerLectures.homeWork;

/**
 * Created by Velikiy on 10.07.2016.
 */
public class FourthHomeWorkArrayOddNumbers {
    public static void main(String[] args) {
        int [] myArr = {0,5,2,4,7,1,3,19};
        int sum = 0;

        for(int i = 0; i < myArr.length; i++)
        {
            if( myArr[i] % 2 != 0 )
            {
                sum += myArr[i];

                System.out.println("Odd is " + myArr[i]);
            }
        }
        System.out.println( "Sum of odds is " + sum );
    }
}
