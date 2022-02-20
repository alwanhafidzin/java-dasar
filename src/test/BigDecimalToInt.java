package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalToInt {
    public static void main(String[] args) {
        BigDecimal test = new BigDecimal(1312333.679999);
        System.out.println(convertBigDecimalToString(test));
    }
    private static String convertBigDecimalToString(BigDecimal input){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        df.setGroupingUsed(false);
        return df.format(input).replaceAll("\\.","");
    }
}
