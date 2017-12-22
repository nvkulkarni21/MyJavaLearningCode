/*
* This code is working as of now with the precedence check.
* I am not able to find a correct algorithm to apply precedence as of now. So will do it when i think of a easy algo
*/
package assignment.arithExpEval;

public class ArithExpEvalMain {

    public static void main(String[] args) {

        //calling input expression class
        InputExp InputExp = new InputExp();
        String inputVal = InputExp.InputExp();

        EvaluateExp Evaluate = new EvaluateExp();
        System.out.println(" Result of the expression is : " + Evaluate.eval(inputVal));




    }
}
