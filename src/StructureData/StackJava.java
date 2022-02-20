package StructureData;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        //Stack: Tumpukan

        Stack<String> movieList = new Stack<String>();
        System.out.println(movieList.size());
        movieList.add("Movie1");
        movieList.add("Movie2");
        movieList.add("Movie3");
        System.out.println(movieList.indexOf(1));
        movieList.peek();
        System.out.println(movieList);
        movieList.pop();
        movieList.pop();
        movieList.pop();
        System.out.println(movieList);
    }
}
