package Assignment.quickSort;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by 44020369 on 10/26/2017.
 */
public class QuickSortTest {
    @Test
    public void quickSortInput() throws Exception {

    }

    @org.junit.Test
    public void printArray() throws Exception {


    }

    @org.junit.Test
    public void findPivot() throws Exception {

        QuickSort o = new QuickSort();
        int a[] = {23,4,62,12,4};
        int val = o.findPivot(a,"L");
        System.out.println("Value is : " + val);
        //failed test
        // assertEquals(1,val);
        //successful test
        assertEquals(1,val);
    }

    @org.junit.Test
    public void partition() throws Exception {

    }

    @org.junit.Test
    public void sort() throws Exception {

    }

}