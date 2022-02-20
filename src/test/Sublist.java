package test;

import java.util.ArrayList;
import java.util.List;

public class Sublist {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        for (int i = 1; i <= 105; i++) {
            listString.add(String.valueOf(i));
        }
        var sizeListString = listString.size();
        var lastSize = sizeListString % 10;
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i <= sizeListString; i++) {
            if (i == sizeListString && sizeListString % 10 != 0) {
                System.out.println(listString.subList(sizeListString - lastSize, i));
                list2 = listString.subList(sizeListString - lastSize, i);
            } else {
                if (i % 10 == 0 && listString.size() >= 10) {
                    System.out.println(listString.subList(i - 10, i));
                } else if (sizeListString < 10) {
                    System.out.println(listString.subList(0, i));
                }
            }
        }
        //Cara get : accessToken + page
        //Misal AccessToken : adkak
        //Untuk page 1 : adkak1 //Untuk page 2 : adkak2 //dst
        Boolean status = false;

        try {
            status = true;
        } catch (Exception e) {

        } finally {
            System.out.println(status);
        }

        System.out.println(list2);

        System.out.println("AAAA" + 1);
        System.out.println("=================================");
        List<String> listData = new ArrayList<>();
        for (int i = 1; i <= 105; i++) {
            listData.add(String.valueOf(i));
        }
        int page = 1;
        var totalList = listData.size();
        System.out.println(totalList);
        if(totalList < (page *10) && (page * 10) <= ((totalList/10)*10)+10) {
            System.out.println(listData.subList((page-1) * 10, ((page-1) * 10) + (totalList % 10)));
        }else if (totalList > (page * 10)) {
            System.out.println(listData.subList((page-1) * 10, ((page-1) * 10) + 10));
        }else{
//            System.out.println("Unreach Page");
        }
    }
}
