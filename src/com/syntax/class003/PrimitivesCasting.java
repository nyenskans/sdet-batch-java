package com.syntax.class003;

public class PrimitivesCasting {

    // main + ctrl + space --> auto complete
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int i = 100; //this is byte sized value
        double d = 100;

        System.out.println(i); // 100 widening
        System.out.println(d); // 100.0

        // Casting in java is converting of one type of value into another

        /* 1st type of casting is Widening/ Implicit (automatic)
         *
         * smaller type into a bigger type
         *
         * byte-> short -> int -> long -> float -> double
         *
         */


        long l = 10000; // int sized value

        // byte b=130; this value is too big for byte



        /* Second type is Narrowing/Explicit (Manual) casting
         *
         * bigger type into a smaller type
         *
         * double-> float -> long -> int -> short -> byte
         */

        int x = (int) 100.99; //we added cast because we get error message: Type mismatch: cannot convert from int to double
        System.out.println(x);

        /* Java will store the value as int even though it's double,
         * but it will lose some information
         *
         * So the output will be 100 (we lose the decimals
         */


        byte b = (byte) 130; //Type mismatch: cannot convert from byte to int
        System.out.println(b); //output is -126

        long l1 = 4935;
        long l2 = 48866586930392l;


        //cannot convert from double to float
        //float f=10.99587534542654;

        float f = 10.99f; // explicit casting

        System.out.println(f);
        // every decimal type is by default considered double by java
        // every whole number type is by default considered integer by java


        double dd = 9.99;

        int price = 100;


    }
}
