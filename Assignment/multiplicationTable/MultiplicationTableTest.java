package Assignment.multiplicationTable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MultiplicationTableTest {
    @Test
    public void multTableTest() throws Exception {

        List<Integer> expected_res = Arrays.asList(7, 14, 21, 28, 35, 42, 49, 56, 63, 70);
        List<Integer> actual_res = new ArrayList<>();

        System.out.println("Expected result is : " + expected_res);

        MultiplicationTable multest = new MultiplicationTable();
        actual_res = multest.multTable(7);

        System.out.println( "Actual result is : " + actual_res);
        assertTrue("Test is pass", expected_res.equals(actual_res));
        //assertTrue("Test is failed", !expected_res.equals(actual_res));

    }


    @Test
    public void multtable2() throws Exception {

    }

}