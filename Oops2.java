/**
 * Created by user on 7/12/2017.
 x is 0
 x is now 15
 x and y are 15 and 16

 */
public class Oops2 {
    public static void placeVal() {
        /*double[] values = {4, 77, 234, 4563, 13467, 635789};

        for (int i = 0; i < values.length; i++) {
            double tenthPower = Math.floor(Math.log10(values[i]));
            double place = Math.pow(10, tenthPower);
            System.out.println(place); */

        int Number = 12371389;
        int tensVal=(Number/10)%10;
        int hunVal=(Number/100)%10;
        double cal= (double) (813 % 100 / 3 + 2.4);
        System.out.println(tensVal);
        System.out.println(hunVal);
        System.out.println(cal);
    }

    public static void main(String[] args) {
        placeVal();     //calling method here
        int x = 0;
        System.out.println("\n x is " + x);

        x = (int) 15.26666;   // set x to 15.2
        System.out.println("x is now " + x);

        int y;      // set y to 1 more than x
        y = (int)x + 1;
        System.out.println("x and y are " + x + " and " + y);
    }
}
