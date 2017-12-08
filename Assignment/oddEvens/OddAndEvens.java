package Assignment.oddEvens; /**
 * Created by 44020369 on 7/25/2017.
 */
import java.util.*;

public class OddAndEvens {

    public static String sUser,valsName;
    public static String sComputer;

    public static void main(String[] args){
        System.out.println("Let's play a game called \"Odds and Evens\" !!");
       int a = -2;
        System.out.println(a);

        pickOddsEvens();
        playGame();


   }

   public static void pickOddsEvens(){
       System.out.println("What is your name?");
       Scanner sName = new Scanner(System.in);
       valsName = sName.next();
       System.out.println("Hi " + valsName + ", which do you choose? (O)dds or (E)vens");
       Scanner sInput = new Scanner(System.in);
       String valsInput = sInput.next();
       if(valsInput.equalsIgnoreCase("O")){
           System.out.print(valsName + " has picked odds!");
           System.out.println("The Computer will be evens");
           sUser = "O";
           sComputer = "E";
       }
       else if (valsInput.equalsIgnoreCase("E")){
           System.out.print(valsName + " has picked evens!");
           System.out.println("The Computer will be odds");
           sUser = "E";
           sComputer = "O";
       }
       else{
           System.out.println("Please enter O or E only");
           System.exit(0);
       }
   }

   public static void playGame(){
       System.out.println("How many \"fingers\" do you put out?");
       Scanner iUserIn = new Scanner(System.in);
       int valiUserIn = iUserIn.nextInt();
       Random iRand = new Random();
       int valiRand = iRand.nextInt(6);
       System.out.println("The Computer plays number \"fingers\" " + valiRand);
       int iSum = valiRand + valiUserIn;
       System.out.println("Sum value : " + iSum);
       boolean bResult = true;
       bResult = iSum % 2 == 0;
       System.out.println("Boolean Value : " + bResult);

       if (bResult = true) {
           System.out.println("Even guy wins");
           if (sUser.equals("E")){
               System.out.println("This means user " + valsName + " is winner !!");
           }
           else {
               System.out.println("This means computer is winner!! ");
           }

       }
       else if (bResult = false){
           System.out.println("Odd guy wins !!");

           if (sUser.equals("O")){
               System.out.println("This means user " + valsName + " is winner !!");
           }
           else {
               System.out.println("This means computer is winner!! ");
           }
       }


   }


}
