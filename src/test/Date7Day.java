package test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date7Day {
    public static void main(String[] args) {
        DateFormat formatMutasiDate = new java.text.SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.DATE, -6);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        Date newDate = cal.getTime();
        String todayDate = formatMutasiDate.format(today);
        String date7DayBefore = formatMutasiDate.format(newDate);
        System.out.println("Today = " + todayDate);
        System.out.println("Date = "+ date7DayBefore);

    }
}
