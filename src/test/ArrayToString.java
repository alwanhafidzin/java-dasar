package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayToString {
    public static void main(String[] args) {
        List<String> data1 = new ArrayList<>();
        data1.add("AA");
        data1.add("BB");
        data1.add("BD");
        data1.add("BC");
        data1.add("BV");
        data1.add("BG");
        List<String> data2 = new ArrayList<>();
        data2.add("10000");
        data2.add("20000");
        data2.add("20000");
        data2.add("20000");
        data2.add("20000");
        data2.add("20000");
        List<String> data3 = new ArrayList<>();
        data3.add("BTN 0");
        data3.add("BTN 1");
        data3.add("BTN 2");
        data3.add("BTN 3");
        data3.add("BTN 4");
        data3.add("BTN 5");
        String[] result = new  String[data1.size()];
        for(int i =0; i<data1.size(); i++){
            if(i != data1.size()-1){
                result[i] = data1.get(i).concat("-" +data2.get(i).concat("-" + data3.get(i) +"\n"));
            }else {
                result[i] = data1.get(i).concat("-" +data2.get(i).concat("-" + data3.get(i)));
            }
        }
        String delimiter = "";
        String lastResult = String.join(delimiter, result);
        System.out.println(lastResult);
    }
}
