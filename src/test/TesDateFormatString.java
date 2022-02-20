package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesDateFormatString {
    public static void main(String[] args) {
        var date = new Date();
        var sdf=new SimpleDateFormat("dd/MM/YYYY");
        var stf= new SimpleDateFormat("hh:mm:ss");
        String dateString=sdf.format(date);
        String timeString =stf.format(date);
        String dateNowSrting = dateString.concat("T"+timeString);
        System.out.println(dateNowSrting);
    }
}
