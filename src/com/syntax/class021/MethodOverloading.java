package com.syntax.class021;

public class MethodOverloading {

    // we are creating a method to solve a problem

   static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    // if we have to use two doubles instead int, we have to create another method
    static void addDoubles(double num3, double num4){
        System.out.println(num3+num4);

    }
    // again, if we have to add up say three numbers, we would have to create another method and so on:
    static void add3Doubles(double num3, double num4, double num5) {
        System.out.println(num3 + num4);
    }
    // if we have to make more methods but just change parameters, we don't have to make different ones
    // we can call the methods the same but the parameters must be different-->
    //-->> that's how java knows which method you're calling (by the parameters we're passing

    public static void main(String[] args) {
        add(24,33);
        addDoubles(23.4,45.3);
    }


}
