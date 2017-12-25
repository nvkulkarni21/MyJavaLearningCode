
package assignment.arithExpEval;

public class ArithExpEvalMain {

    public static void main(String[] args) {

        //calling input expression class
        InputExp InputExp = new InputExp();
        String inputVal = InputExp.InputExp();

        //this evaluates the complete expression
        EvaluateExpFinal Evaluate = new EvaluateExpFinal();

        System.out.println(" \nRESULT OF THE EXPRESSION IS : " + Evaluate.eval(inputVal));

    }
}
