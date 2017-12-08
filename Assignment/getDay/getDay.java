package Assignment.getDay;
//this program is based upon algorithm fomr this website https://dzone.com/articles/algorithm-week-how-determine
//the algorithm seems faulty to calculate the day.

import java.util.InputMismatchException;

public class getDay {

    public static void main(String[] args) {

        getDay getDay = new getDay();
        String dayVal = getDay.get_day_from_date();
        System.out.println("Day is : " + dayVal);
    }

    public static int get_century_code(int century){

        if (1700 <= century && century <= 1799)
            return 4;
        if (1800 <= century && century <= 1899)
            return 2;
        if (1900 <= century && century <= 1999)
            return 0;
        if (2000 <= century && century <= 2099)
            return 6;
        if (2100 <= century && century <= 2199)
            return 4;
        if (2200 <= century && century <= 2299)
            return 2;
        if (2300 <= century && century <= 2399)
            return 0;
        if (2400 <= century && century <= 2499)
            return 6;
        if (2500 <= century && century <= 2599)
            return 4;
        if (2600 <= century && century <= 2699)
            return 2;
        return 0;
    }

    public String get_day_from_date() {

        int[] months = new int[13];

        months[1] = 0;
        months[2] = 3;
        months[3] = 3;
        months[4] = 6;
        months[5] = 1;
        months[6] = 4;
        months[7] = 6;
        months[8] = 2;
        months[9] = 5;
        months[10] = 0;
        months[11] = 3;
        months[12] = 5;

        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        String iDate = "2017-11-05"; // "1883-01-31";//
        System.out.println(iDate);

       /* Calendar c = Calendar.getInstance();
        c.setTime(iDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
        System.out.println(iDate);*/
        String yearS = iDate.substring(0,4);
        System.out.println(yearS);

        int year = Integer.parseInt(yearS);
        //System.out.println(year);
        // calculate the date
        //String dateParts = explode('-', $date);
       /*
        //$year = substr($dateParts[2], 2);
        int year = Integer.parseInt(yearS.substring(0,2));

        int cent = Integer.parseInt(yearS.substring(0,2));
        System.out.println(cent);
        int century = get_century_code(cent);
        int c = year/4;
        int monthNo = Integer.parseInt(iDate.substring(5,2));
        System.out.println(monthNo);*/
        int corr_cent = get_century_code(year);
        System.out.println("Year from method : " + corr_cent);
        String yearL2 = yearS.substring(2,4);
        int iyearL2 = Integer.parseInt(yearL2);
        System.out.println("Last 2 digit of year : " + iyearL2);
        double divideC = (iyearL2/4);
        divideC = Math.floor(divideC);
        System.out.println("Divide year by 4 "  + divideC);
        String monthnoS = iDate.substring(5,7);
        System.out.println("Month is "  + monthnoS);
        int imonth = Integer.parseInt(monthnoS);
        int imonthno = months[imonth];
        System.out.println("Value from month table : " + imonthno);
        int sum = corr_cent + iyearL2 + (int) divideC + imonthno;
        System.out.println("Summing :" + corr_cent + " " +  iyearL2 + " " +  (int) divideC + " " + imonthno) ;
        System.out.println("Sum :" + sum);
        int valDiv = sum % 7;
        System.out.println("Sum divide by 7: " + valDiv);

        return days[valDiv];


    }
}

