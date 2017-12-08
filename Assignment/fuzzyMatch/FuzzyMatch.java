package Assignment.fuzzyMatch;


import java.util.Scanner;

public class FuzzyMatch {
    String str1;
    String str2;

    public void acceptString() {

        System.out.println("Enter 1st String  ");
        Scanner inputTxtob = new Scanner(System.in);
        this.str1 = inputTxtob.nextLine();

        System.out.println("Enter 2nd String  ");
        Scanner inputtxt2ob = new Scanner(System.in);
        this.str2 = inputtxt2ob.nextLine();
    }

    public static void main(String[] args) {

        FuzzyMatch FuzzyMatch = new FuzzyMatch();
        FuzzyMatch.acceptString();

        System.out.println("1st string is : "  + FuzzyMatch.str1);
        System.out.println("2nd string is : "  + FuzzyMatch.str2);

        //calling fuzzylogic, running for algorithm 3
        FuzzyLogic FuzzyLogic = new FuzzyLogic(FuzzyMatch.str1, FuzzyMatch.str2);
        int fuzzyPer = FuzzyLogic.fuzzyProgram(FuzzyMatch.str1, FuzzyMatch.str2);

        //calculating percentage
        System.out.println("Percentage match of strings is :" +  FuzzyMatch.calPer(fuzzyPer));

    }


    public int calPer(int fuzzyPer){
        int percentage;

            percentage = fuzzyPer * 100;

            return percentage;
    }
}
