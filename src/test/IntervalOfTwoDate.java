package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class IntervalOfTwoDate {
    public static void main(String[] args) throws ParseException {
        LocalDate aDate = LocalDate.of(2020, 9, 11);
        LocalDate sixDaysBehind = aDate.minusDays(6);

        Period period = Period.between(aDate, sixDaysBehind);
        int diff = Math.abs(period.getDays());
        System.out.println(diff);

        LocalDate yearDate = LocalDate.of(2020, 9, 11);
        LocalDate yearDaysBehind = aDate.minusYears(3);

        var now = new Date();


        Period period2 = Period.between(yearDate, yearDaysBehind);
        int diff2 = Math.abs(period2.getYears());
        System.out.println(new Date());
        System.out.println(diff2);

        SimpleDateFormat formatter = new SimpleDateFormat(
                "dd/MM/yyyy");
        var tes =formatter.parse(formatter.format(new Date()));
        System.out.println("---------");
        System.out.println(tes);
    }
}
