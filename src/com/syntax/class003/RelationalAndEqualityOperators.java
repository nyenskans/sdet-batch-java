package com.syntax.class003;

public class RelationalAndEqualityOperators {

    public static void main(String[] args) {

        /*
         *
         * <
         * >
         * <=
         * >=
         * ==
         * !=
         *
         *
         */
        int num1 = 20;
        int num2 = 22;
        System.out.println(num1 > num2); //false
        System.out.println(num1 < num2); //true
        System.out.println(num1 != num2); //true
        // The result is always boolean value


        System.out.println(num1 == num2); //false
        //This is question of equality of two values, they are not equal
        System.out.println(num1 = num2);//22
        //This is assigning of value num2 to num1

        System.out.println(num1 == num2); //true
        //Now they are equal because the value of num 1 was reassigned  value 22

        //= assignment of value
        //== comparison of equality of two variables' values

        boolean result = 100 > 200; // relational operator, boolean type
        System.out.println(result); //false
        int result1 = 100 + 200; //arithmetic operator, integer type var
        System.out.println(result1);

        String result2 = "Emre" + 10;
        System.out.println(result2); //concatenation
        //whenever we add something to string value the result is a string value

        int num3 = 10;
        int num4 = 11;
        //we don't have to declare result as boolean again, we are just reassigning it
        result = num3 == num4; //checking if num3 equal to num4
        System.out.println(result);    // false


        result = num3 != num4;
        System.out.println(result);    // true


    }

}
