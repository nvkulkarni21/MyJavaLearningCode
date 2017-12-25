
package assignment.arithExpEval;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class EvaluateExpFinal {

    public int eval(String inputVal) {

        ArrayList<String> expression = new ArrayList<>();

        String[] token = inputVal.split(" ");

        //validation for input validation
        testInput(token);

        for (String str : token){
            expression.add(str);
        }

        //evaluates the expression as per precedence.
        //if () needs to be handled we must write one one method which woul calculate the value in brackets first and return in expression
        expression = calculate(expression, evalPrecedence(1));
        expression = calculate(expression, evalPrecedence(2));
        expression = calculate(expression, evalPrecedence(3));
        expression = calculate(expression, evalPrecedence(4));

        try{
            return  Integer.parseInt(expression.get(0));
        }
        catch (NumberFormatException e){
            System.out.println(" Incorrect value calculated. Please contact programmer.");
            return -999;
        }
   }

    public ArrayList<String> calculate(ArrayList<String> expression, String operator){

        for (int i = 1; i < expression.size() ; i++) {

            if (expression.get(i).equals(operator)){

                int val1 = Integer.parseInt(expression.get(i-1));
                int val2 = Integer.parseInt(expression.get(i+1));

                expression.set(i-1, Integer.toString(evalExp(Integer.parseInt(expression.get(i-1)), Integer.parseInt(expression.get(i+1)), operator)));
                //System.out.println("Value at iteration " + i + " after set is " + expression);
                expression.remove(i);
                expression.remove(i);
                i--;
            }
        }
        return expression;
    }

    //return false if next operand has lower precedence
    public String evalPrecedence(int op1){
        if (op1 == 1 )
            return "*";
        if (op1 == 2)
            return "/";
        if (op1 == 4)
            return "+";
        if (op1 == 3)
            return "-";

        return "Invalid operator";
    }

    public int evalExp (int no1, int no2, String exp){
        int res;
        try {
            System.out.println("Calling evalExp method");
            System.out.println("No 1 is  " + no1 + " and no2 is " + no2 + " . Exp is " + exp);

            switch (exp) {
                case "/":
                    res = (no1 / no2);
                    //System.out.println("In division, value is " + res);
                    break;
                case "*":
                    res = (no1 * no2);
                    //System.out.println("In multiplcation, value is " + res);
                    break;
                case "+":
                    res = (no1 + no2);
                    //System.out.println("In addition, value is " + res);
                    break;
                case "-":
                    res = (no1 - no2);
                    break;
                default:
                    //System.out.println("Invalid expression passed.");
                    res = 0;
                    break;

            }
        }catch (NoSuchElementException e) {
            res = 0;
            System.out.println(e.getMessage() + " Cannot fetch a correct expression. Please check your expression .");
        }

        return res;
    }

    //this method checks the required validation
    public static void testInput(String[] token){
        String allowedExp = "+ - * /";
        for (String str : token) {

            try {

                if (Integer.parseInt(str) < 0) {
                    System.out.println("VALIDATION ERROR !!!! \nExpression should have only positive number.");
                    System.out.println("Integer " + str + " is a negative number");
                    System.exit(0);
                    //throw new IllegalArgumentException("Please enter positive values.");
                }

            } catch (IllegalArgumentException e) {
                if (!allowedExp.contains(str)) {
                    System.out.println("VALIDATION ERROR !!!! \nExpression is out of scope. It should be + - * /");
                    System.exit(0);
                    //throw new IllegalArgumentException("Please input valid operator.");
                }

            }
        }

    }
}
