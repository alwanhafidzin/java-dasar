package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TimeOneMinute {
    public static void main(String[] args) {
        String inputTime = "19:00";
        LocalTime localTime = LocalTime.parse(inputTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatTime = dtf.format(localTime);
        String substring = formatTime.substring(0, formatTime.length() - 2);
        String lastTime = substring + "60";
        System.out.println(formatTime);
        System.out.println(lastTime);
    }
}
