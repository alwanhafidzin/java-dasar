package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTry {
    public static void main(String[] args) {
        Date today = new Date();
        //YYMMDD
        DateFormat format1 = new SimpleDateFormat("YYMMDD");
        System.out.println(format1.format(today));

        DateFormat format2 = new SimpleDateFormat("YYYYMMDDHHMNSS");
        System.out.println(format2.format(today));
    }
}
