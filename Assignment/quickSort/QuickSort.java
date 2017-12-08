package Assignment.quickSort;
//65,72,23,36,99,20,1,44
//3,1,4,1,5,9,2,6,5,3
import java.util.Scanner;

public class QuickSort {

    int inputCount;

    public static void main(String[] args){

        int[] arrVal;
        QuickSort QuickSortObj = new QuickSort();
        arrVal = QuickSortObj.QuickSortInput();

        QuickSortObj.printArray(arrVal);

        QuickSortObj.sort(arrVal,0,arrVal.length-1);
        QuickSortObj.printArray(arrVal);
        //QuickSortCP cp = new QuickSortCP();

        //calling function quicksortcp
       /* System.out.println("\n Before Sorted ! ");
        cp.quicksort(arrVal,0,arrVal.length-1);
        System.out.println("\n  Sorted ! ");
        QuickSortObj.printArray(arrVal);*/
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

    public int findPivot(int[] inputArr,String pivotLoc){

        int Pivot=0;
        if (pivotLoc == "L") {
            Pivot = 0 ; //inputArr[0]; //.length / 2;
        }
        else if (pivotLoc == "R"){
            Pivot = inputArr.length;
        }
        else if (pivotLoc == "M")
            Pivot = inputArr.length/2;

        return Pivot;
    }
    int partition(int[] arrint , int pivot,int r){

        int j=pivot+1;
        int tempSwap;
        int pivotVal=arrint[pivot];

        System.out.println("\nIn partitionining." );

        for (int i=pivot+1 ;i<=r;i++){
            //for (int j=1;j<arrint.length-1;j++)
                if(arrint[i] < pivotVal){

                    if (i!=j){
                        System.out.println("\nThe number " + arrint[i] + " is smaller than pivot " + arrint[pivot] );
                        tempSwap=arrint[j];
                        arrint[j]=arrint[i];
                        arrint[i]=tempSwap;

                        System.out.println("So, the intergers " + arrint[i]  + " and " + arrint[j] +" are swapped.");
                    }
                    j++;
                }
             // System.out.println("\nLast element in the array. Pivot swapped with the last closed item : " + pivot);
        }
        arrint[pivot] = arrint[j-1];
        arrint[j-1]=pivotVal;
        //System.out.println("\nNow sorted array is ");
        return j-1;
    }


    void sort(int[] arrVal,int start, int end){

        QuickSort Obj = new QuickSort();
        //L = Left pivot, R=Righmost pivot , M - Midpivot
        if(start<end) {
            int pivot = Obj.findPivot(arrVal, "L");
            System.out.println("\nPivot is at index = " + pivot);

            int partIn = Obj.partition(arrVal, start, end);
            sort(arrVal, start, partIn - 1);
            sort(arrVal, partIn + 1, end);
        }
    }
}