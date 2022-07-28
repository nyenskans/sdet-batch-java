package com.syntax.class002;

public class NonPrimitiveDataTypes {

    @SuppressWarnings("unused")
    public static void main(String[] args) {


        // 2. Non primitive data types

        //String


        /*
         *  String is a sequence/combination/group of characters
         *
         *
         * Non-primitive data type names are written in Uppercase
         *
         *
         */

        String schoolName = "Syntax";

        System.out.println("Syntax");

        System.out.println(schoolName);

        String name = "John";
        String lastName = "Smith";

        long phone = 1234567890l;

        //If we want it in this format xxx-xxx-xxxx:

        String phoneNumber = "123-456-7890";
        String address = "123 Washington str";

        // int age = "10"; not an integer
        int age = 30;
        String city = "Miami";
        //shortcut for printing System.out.println
						
				/* When we want to attach string to string 
				 we can use +
				*/
        System.out.println(name + lastName); //will print out JohnSmith
        System.out.println(name + " " + lastName); // will print out John Smith


        //John lives in Miami
        System.out.println(name + " lives in " + city);

        //John is 30 years old

        System.out.println(name + " is " + age + " years old");

        /* We can use + -> works as concatention operator
         * 			to attach String to String
         * 			to attach String to int
         * 			to attach String to double
         * 			to any other type
         */


    }

}
