/**
 * Created by user on 7/6/2017.
 *
 A well-formed Java program has
 a main method with { and }
 braces.

 A System.out.println statement
 has ( and ) and usually a
 String that starts and ends
 with a " character.
 (But we type \" instead!)
 */
public class WellFormed {
    public static String makeFancy(String s) {
        if (s.length() == 0) {
            return "*";
        }
        return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
    }

    public static int puzzle(int i, int j) {
        if (i == j) {
            return 0;
        } else {
            return 1 + puzzle(i - 2, j - 1);
        }
    }

    public static int someCode(int a, int b, int c){
        if((a<b) && (b<c)) {
            return a;
        }
        if((a>=b) && (b>=c)) {
            return b;
        }
        if((a==b) || (a==c) || (b==c)) {
            return c;
        }
        else
            return  a;
    }

    public static void main(String[] args){
      /*  System.out.println("A well-formed Java program has\na main method with { and }\nbraces.\n");
        System.out.println("A System.out.println statement\nhas ( and ) and usually a\nString that starts and ends\nwith a \" character.");
        System.out.println("(But we type \\\" instead!)");*/
        int x = 3;
        String s = makeFancy("JAVA");
        System.out.println("s ia  " + s);
        int i = puzzle(22, 11);
        System.out.println("i is  " + i);
        System.out.println(Math.min(Math.min(1,2),3));
        System.out.println(Math.abs(-2344%10));
    }

}




