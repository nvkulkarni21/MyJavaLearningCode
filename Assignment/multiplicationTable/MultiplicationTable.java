package Assignment.multiplicationTable;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public static void main(String[] args) {
        List<Integer> al ; //= new ArrayList<>();
        al=multTable(7);
        ArrayList<Integer> al2 ; //= new ArrayList<>();
        System.out.println("Multiplied table :" + al);
        al2=multtable2(7);
        System.out.println("Multiplied table 2 :" + al2);


    }


    public static List<Integer> multTable (int n){
        List<Integer> result = new ArrayList<>();
        for (int i = 1 ; i < 11 ; i++) {
            result.add(n * i);
        }
        return result;
    }

    public static ArrayList<Integer> multtable2(int n){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1 ; i < 11 ; i ++){
             al.add(n*i);
        }
        return al;

    }
}
