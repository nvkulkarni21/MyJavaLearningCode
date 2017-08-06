import java.util.*;

/**
 * Created by user on 7/16/2017.
 */

public class tripPlannerAssn1 {
    public static void main(String [] args){
        //Greeting();
        //TimeBudget();
        TimeDiff();
    }
    public static void Greeting(){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        Scanner name = new Scanner(System.in);
        Scanner dest = new Scanner(System.in);
        String valueName = name.nextLine();
        System.out.print("Nice to meet you " + valueName + ",where are you travelling to? ");
        String valueDest = name.nextLine();
        System.out.println("Great! " + valueDest + " sounds like a great trip");
        System.out.print("*************");
        //System.out.println(valueDest);
    }

    public static void TimeBudget(){
        System.out.print("\n\nHow many days are you going to spend travelling ");
        Scanner Days = new Scanner(System.in);
        double valueDays = Days.nextDouble();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        Scanner Money = new Scanner(System.in);
        int valueMoney = Money.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination ");
        Scanner Curr = new Scanner(System.in);
        String valueCurr = Curr.nextLine();
        System.out.print("How many " + valueCurr + " are there in 1 USD ");
        Scanner Conv = new Scanner(System.in);
        double valueConv = Conv.nextDouble();

        int min;
        int hrs = (int) valueDays*24;
        min=hrs*60;
        double perDay = valueMoney/valueDays;
        double totalBudget  =  valueMoney * valueConv;
        double dayExp = (double) totalBudget/(double)valueDays;

        System.out.println("\nIf you are travelling for " + valueDays + " that is same as " + hrs + " or " + min);
        System.out.println("If you are going to spend $" + valueMoney + " that means per day you can spend up to $" + perDay);
        System.out.println("Yout total budget in MXC is $" + totalBudget + valueCurr + ", which per day is " + (int)dayExp + valueCurr);
        System.out.println("********************");

        }

        public static void TimeDiff(){
            System.out.print("What is the time difference, in hours, between your home and your destination? ");
            Scanner timeDist = new Scanner(System.in);
            int timeDistValue = timeDist.nextInt();

            Date date1 = new Date();
            System.out.println("Time is : " + date1);
            Double timeConv = 12.00 + timeDistValue;

            System.out.println("That means when it is midnight at home it will be " + timeConv);
    }
}
