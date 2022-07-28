package com.syntax.class007;

public class PreincrementAndPostincrement {

    public static void main(String[] args) {

        int num = 10;

        int result = num++;

        System.out.println(num); //output 11
        System.out.println(result);// 10, because we assign num to result and AFTER we increment it


        System.out.println("-----------------------------");

        int num1 = 10;
        int result1 = ++num1;
        System.out.println(num1); //output 11
        System.out.println(result1);// 11, because we increment num1 first and then we assign it to result1


    }

}
