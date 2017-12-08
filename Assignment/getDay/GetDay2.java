package Assignment.getDay;

public class GetDay2 {
    private String iDate;

    public GetDay2(String iDate) {
        this.iDate = iDate;
    }

    public String getiDate() {
        return iDate;
    }


    public String dayofweek(int d, int m, int y)
    {
        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (m < 3 ){
            y = y-1;
        }
        else {
            y = y + 0;
        }

        int retVal =  ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;

        return days[retVal];
    }


    /* Driver function to test above function */
    public static void main(String[] args) {

        GetDay2 getDay = new GetDay2("2017-11-04");

        System.out.println("Date is : " + getDay.getiDate());

        //String yearS = Assignment.getDay.iDate.substring(0,4);
        int iyear = Integer.parseInt(getDay.iDate.substring(0,4));
        System.out.println("year : " + iyear);
        //String monthnoS = Assignment.getDay.iDate.substring(5,7);

        int imonth = Integer.parseInt(getDay.iDate.substring(5,7));
        System.out.println("Month is "  + imonth);

        int idate = Integer.parseInt(getDay.iDate.substring(8,10));
        System.out.println("Date is : " + idate);

        String dayVal = getDay.dayofweek(idate,imonth,iyear);
        System.out.println("Returns values : " + dayVal);

    }


}
