/*
* (star) Simple Arithmetic Expression Evaluator: Write a program that accepts from the user an arithmetic expression with the following constraints:
•the user will only enter positive integers
•the user will only do these operations: + - * / (i.e., + = add, - = subtract, * = multiply, / = divide)
•The precedence of * and / are higher than + and - (as is the case in traditional school maths)
•The * and / operators have the same precedence, + and - have the same precedence
•for simplicity, all numbers and operators will be separated by exactly one space

* */

package assignment.arithExpEval;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class EvaluateExp {

    public int eval(String inputVal) {
        String allowedExp = "+ - * ";
        int res=0;
        ArrayList<Integer> inputIntVal = new ArrayList<>();
        ArrayList<String> inputStrVal = new ArrayList<>();

        //converting string into array method1
        //char[] token = inputVal.toCharArray();
        //System.out.println(token);

        String[] token = inputVal.split(" ");

        for (String str : token) {
            try {

                if (Integer.parseInt(str) < 0) {
                    System.out.println("Expression should have only positive number.");
                    System.out.println("Integer " + str + " is a negative number");
                    System.exit(0);
                }

                inputIntVal.add((int) Integer.parseInt(String.valueOf(str)));


            } catch (NumberFormatException e) {
                //System.out.println("\n" + str + " is not a valid integer number");
                if (allowedExp.contains(str)) {
                    inputStrVal.add(str);
                } else {
                    System.out.println("Expression is out of scope. It should be + - * /");
                    System.exit(0);
                }

            }

        }


        /*for (int i=0; i<token.length;i++){
            //System.out.print(token[i] + "\t" );

            if (token[i] == " "){
                System.out.println("\nIt is a white space, need not to add into a array");
                continue;
            }
            else if (token[i] >= '0' && token[i].toString()<='9'){
                //ystem.out.println("It is a number, need to store as an integer array");
                inputIntVal.add((int) Integer.parseInt(String.valueOf(token[i])));

            }


        }*/
        System.out.println("\nEntered expression is " + inputVal);
        System.out.println("\nInteger array is ..");
        System.out.println(inputIntVal);
        System.out.println("\nString array is ..");
        System.out.println(inputStrVal);

        int count = 0;
        ListIterator<Integer> iterator = inputIntVal.listIterator();
        while (iterator.hasNext()){
            //System.out.println(++count + " Value of count : " + count );



            try {
                //System.out.println("Niraj - iterator " + iterator.next());
                //System.out.println("Niraj - iterator " + iterator.next());
                try {
                    if (iterator.nextIndex() == 0 ) {
                        res = evalExp(iterator.next(), iterator.next(), inputStrVal.get(count));
                        count++;
                    }
                    else{
                        res = evalExp(res, iterator.next(), inputStrVal.get(count));
                        count++;
                    }
                    //System.out.println("Value of result is " + res);
                }
                catch (Exception e){
                    res = 0;
                    System.out.println("Cannot fetch a correct expression. Please checks your expression .");
                }

            }catch (NoSuchElementException e) {
                System.out.println(e.getMessage() + " from the loop");
            }
        }

//        try {
//            res = evalExp(inputIntVal.get(0), inputIntVal.get(1), inputStrVal.get(0));
//            //System.out.println("Value of result is " + res);
//        }catch (Exception e){
//            res = 0;
//            System.out.println("Cannot fetch a correct expression. Please checks your expression .");
//        }

            //int res = 0;
        return  res;
    }

    public int evalExp (int no1, int no2, String exp){
        int res;
        try {
            System.out.println("Calling evalExp method");
            System.out.println("No 1 is  " + no1 + " and no2 is " + no2 + " . Exp is " + exp);

            switch (exp) {
                case "/":
                    res = (no1 / no2);
                    System.out.println("In division, value is " + res);
                    break;
                case "*":
                    res = (no1 * no2);
                    System.out.println("In multiplcation, value is " + res);
                    break;
                case "+":
                    res = (no1 + no2);
                    System.out.println("In addition, value is " + res);
                    break;
                case "-":
                    res = (no1 - no2);
                    break;
                default:
                    System.out.println("Invalind expression passed.");
                    res = 0;
                    break;

            }
        }catch (NoSuchElementException e) {
            res = 0;
            System.out.println(e.getMessage() + " Cannot fetch a correct expression. Please check your expression .");
        }

        return res;
    }
}
