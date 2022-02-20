package StructureData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //add
        arrayList.add("Data1");
        arrayList.add("Data2");
        arrayList.add("Data0");
        System.out.println(arrayList);
        //get
        System.out.println(arrayList.get(0));

        for(String i : arrayList){
            System.out.println(i);
        }
        System.out.println("---------");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //Set : FROM 0
        arrayList.set(1, "Data 9");
        System.out.println(arrayList);

        //Remove
        arrayList.remove(0);

        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        //Size
        arrayList.size();
    }
}
