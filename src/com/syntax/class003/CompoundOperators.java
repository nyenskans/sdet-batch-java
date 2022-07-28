package com.syntax.class003;

public class CompoundOperators {
    //Shorthand operators
    public static void main(String[] args) {


        int num = 100;
        num = num + 100;

        System.out.println(num); // output is 200

        num = num + 50;
        System.out.println(num);// output is 250

        // Shorthand addition

        num += 100; //num=num+100
        System.out.println(num); // output is 350

        //Shorthand subtraction

        num -= 10; // num=num-10
        System.out.println(num); // output is 340


        // Shorthand division

        num /= 10; //num=num/
        System.out.println(num); // output is 34


        //Shorthand multiplication

        num *= 2; //num=num*2
        System.out.println(num); // output is 68

        //Shorthand modulo

        num %= 2; //num=num%2
        System.out.println(num); // output is 0


        int a = 10;
        int b = 20;
        int c = 30;

        a += b;
        System.out.println(a); // output is 30

        a += b + c; //a=a+b+c
        System.out.println(a); // output is 80

        a *= 10;
        System.out.println(a); // output is 800


    }

}
