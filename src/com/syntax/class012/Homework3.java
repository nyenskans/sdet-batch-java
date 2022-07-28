package com.syntax.class012;

public class Homework3 {

    public static void main(String[] args) {

//		Create a String and print it in reverse order (Sunday → yadnuS).

        String str = "Sunday";
        String reverse = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);


    }

}
