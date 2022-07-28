package com.syntax.class011;

public class RecapTask008 {

    public static void main(String[] args) {

        // Write a program to print the first 10 numbers of Fibonacci series

        // 0 1 1 2 3 5 8 13 21 34

        int previousNum = 0;
        int currentNum = 1;
        int nextNum = 0;

        int numbersToPrint = 10;

        System.out.print(0 + " ");
        System.out.print(1 + " ");


        for (int i = 0; i < numbersToPrint - 2; i++) {
            nextNum = previousNum + currentNum;
            System.out.print(nextNum + " ");
            previousNum = currentNum;
            currentNum = nextNum;
        }


    }

}
