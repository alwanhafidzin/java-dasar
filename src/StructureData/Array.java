package StructureData;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        //Array Store data From 0
        char[] arrayChar = new char[5];
        arrayChar[1] = 'A';
        arrayChar[0] = 'Z';
        System.out.println(Arrays.toString(arrayChar));

        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 1;
        intArray[2] = 1;
        intArray[3] = 1;
        intArray[4] = 1;

        int total = 0;
        for(int i =0; i <intArray.length; i++){
            total += intArray[i];
        }
        //Array space permanen
        System.out.println(total);
    }
}
