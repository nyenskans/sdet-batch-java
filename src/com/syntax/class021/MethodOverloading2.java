package com.syntax.class021;

public class MethodOverloading2 {
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    // if we have to use two doubles instead int, we have to create another method
    static void add(double num3, double num4){
        System.out.println(num3+num4);

    }

    // again, if we have to add up say three numbers, we would have to create another method and so on:
    // we can call the methods the same but the parameters must be different-->
    //-->> that's how java knows which method you're calling (by the parameters we're passing
// We don't need to come up with a different name because the method does the exact same thing for different parameters
// so we dont have to remember all different method names for a very similar thing
    static void add(double num3, double num4, double num5) {
        System.out.println(num3 + num4+num5);
    }
    static void add(double num6, double num7, double num8, double num9){
        System.out.println(num6 + num7 + num9 + num8);

    }

    public static void main(String[] args) {
        add(20,22);
        add(43.5,54.2,43);
    }
}
