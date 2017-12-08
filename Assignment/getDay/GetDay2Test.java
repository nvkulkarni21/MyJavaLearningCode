package Assignment.getDay;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetDay2Test {
    @Test
    public void dayofweek() throws Exception {

        String iDate = "2017-11-05";
        GetDay2 getDay2 = new GetDay2(iDate);
        String expectedRes = "Sunday";

        int iyear = Integer.parseInt(iDate.substring(0,4));
        //System.out.println("year : " + iyear);
        int imonth = Integer.parseInt(iDate.substring(5,7));
        //System.out.println("Month is "  + imonth);
        int idate = Integer.parseInt(iDate.substring(8,10));
        //System.out.println("Date is : " + idate);
        assertTrue("Error in code! Output does not match.",expectedRes.equals(getDay2.dayofweek(idate,imonth,iyear)) );

    }

}