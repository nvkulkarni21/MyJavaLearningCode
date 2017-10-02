package Assignment;
//65,72,23,36,99,20,1,44

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    //private int[] inputArr = new int[20];
    int inputCount;

    public static void main(String[] args){

        int[] arrVal;
        QuickSort QuickSortObj = new QuickSort();
        arrVal = QuickSortObj.QuickSortInput();

        QuickSortObj.printArray(arrVal);
       
        int pivot =  QuickSortObj.partition(arrVal);
        System.out.println("\nPivot is = " + pivot);

    }

    public int[] QuickSortInput() {
        System.out.println("Enter the number of integers to be sorted");
        Scanner inputCountObj = new Scanner(System.in);
        this.inputCount = inputCountObj.nextInt();
        int[] inputArr = new int[inputCount];
        System.out.println("Enter you numbers required to be sorted\n");
        Scanner inputVal = new Scanner(System.in);
        for (int i = 0 ; i < this.inputCount ; i ++){
            int intValue = inputVal.nextInt();
            inputArr [i] =intValue;
        }
        //System.out.println("Array value is =" + Arrays.toString(inputArr));
        return inputArr;
    }

    public void printArray(int[] iArray){
        //System.out.println("Length of array is " + iArray.length);

        for (int i=0;i < iArray.length;i++ ){
            if (i < iArray.length){
                System.out.print(iArray[i] + ",");
            }
            else
                System.out.print(iArray[i] + ",");
            //System.out.print("Array value is .. ");

            //System.out.println(iArray[i]);
        }
    }

    public int partition(int[] inputArr){

        int midPivot = inputArr.length / 2;

        return midPivot;
    }
}
