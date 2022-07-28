package com.syntax.class022;

public class AdvanceCalculation {
    void sum(int num1, int num2){
        System.out.println(num1+num2);
    }
    void sum(int num1, int num2,int num3){
        System.out.println(num1+num2);
    }




    // if we want to add an unknown number of parameters

    static void method1(int...arr){
        System.out.println("method");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void sum1(int...arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all the parameter values is "+sum);
    }
    public static void main(String[] args) {
        method1(2,3,4);

        sum1(4,6,7,8);



    }
}
