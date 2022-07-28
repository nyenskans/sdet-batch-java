package com.syntax.class004;

import java.util.Scanner; //we are importing scanner class for input

public class UserInput {

    public static void main(String[] args) {

        //creating a scanner
        //Scanner data type - non-primitive
        //input is the name of the variable
        //new is the keyword
        //System.in means we are taking input in
        //Scanner class already exists in the library


        Scanner input = new Scanner(System.in);
        //send instructions to the console
        System.out.println("Please enter your name");

        //we need to take the input value from console

        String name = input.next();

        System.out.println(name + " please enter your age");

        int age = input.nextInt();

        System.out.println(name + " is " + age + " years old");


        input.close();


    }


}
