/**
 * Created by user on 7/13/2017.
 */
import java.util.*;

public class LearnScanner {
    public static void main(String[] args){
        double a = Math.random() * 10;
        System.out.println(a);
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();  //for string ends at space
        if (value%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        //int value = input.nextInt();  //for integer
        //Double value = input.nextDouble();  //for double
        //String value = input.nextLine();  //for string till enter

        //System.out.println("Your value is : " + value);
    }
    public static void xxx()
    {

    }

    public static void xxx(int i){

    }
    public static void xxx(String as){

    }
    public static void xxx(int a,String as){

    }
}
