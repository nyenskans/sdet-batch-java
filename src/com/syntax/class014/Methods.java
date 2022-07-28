package com.syntax.class014;

public class Methods {

    public static void main(String[] args) {

        int maxNumber = maxNum(89, 3);
    }


    public static int maxNum(int num1, int num2) {
        int maxNum = 0;
        if (num1 > num2) {
            maxNum = num1;
        } else if (num2 > num1) {
            maxNum = num2;
        }
        return maxNum;


    }


}