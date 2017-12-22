
package assignment.arithExpEval;



import java.util.ArrayList;
import java.util.*;

public class InputExp {

    public String InputExp() {

        System.out.println("Enter the expression you want to evaluate ..");
        Scanner inputExp = new Scanner(System.in);
        String inputVal = inputExp.nextLine();

        //System.out.println("Entered expression is " + inputVal);

        return inputVal;

    }
}
