package test;

import java.util.Calendar;
import java.util.Date;

public class Date3YearAfter {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.YEAR, 3); // to get previous year add 1
//        cal.add(Calendar.DAY_OF_MONTH, -1); // to get previous day add -1
        Date expiryDate = cal.getTime();
        cal.add(Calendar.HOUR, 1);
        Date plusOneHour = cal.getTime();
        System.out.println("today is --> "+today);
        System.out.println("expiryDate is --> "+expiryDate);


        Calendar cal2 = Calendar.getInstance();
        Date today2 = cal2.getTime();
        cal.add(Calendar.YEAR, 3); // to get previous year add 1
//        cal.add(Calendar.DAY_OF_MONTH, -1); // to get previous day add -1
        Date expiryDate2 = cal2.getTime();
        System.out.println("today is --> "+today2);
        System.out.println("expiryDate is --> "+expiryDate2);

    }
}
