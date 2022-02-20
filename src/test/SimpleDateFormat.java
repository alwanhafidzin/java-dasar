package test;

import java.text.DateFormat;
import java.util.Date;

public class SimpleDateFormat {
    public static void main(String[] args) {
        DateFormat format20 = new java.text.SimpleDateFormat("YYYYMMDDHHmmss");
        System.out.println( format20.format(new Date()));
    }
}
