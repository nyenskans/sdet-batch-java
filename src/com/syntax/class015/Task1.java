package com.syntax.class015;

public class Task1 {

    //Write a method that will take 2 parameters as numbers and print the larger one

    void printLarger(int num1, int num2) {
        int largerNum = 0;
        if (num1 > num2) {
            largerNum = num1;
        } else if (num2 < num1) {
            largerNum = num2;
        } else if (num2 == num1) {
            largerNum = num2;
        }
        System.out.println(largerNum);
    }

    public static void main(String[] args) {
        Task1 largerNum = new Task1();
        largerNum.printLarger(22, 9);
    }


}
