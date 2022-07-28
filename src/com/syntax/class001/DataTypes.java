package com.syntax.class001;

public class DataTypes {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        // 1. Primitive data in Java

        //To create a variable: data type and name

        //whole numbers

        byte box1 = 125;

        short box2 = 2022;

        int box3 = 78334; //most commonly used

        long box4 = 8473842687928L;


        //decimal numbers

        float container1 = 1.99F;
        double container2 = 89.99;

        // to represent 1 character

        char gender = 'm';
        char dollar = '$';

        // to represent true or false

        boolean hungry = true;
        boolean sleepy = false;


        // The purpose of storing values in variables is to be able to use it later
        // For example we can print them out once we've stored these values in variables

        //How to access the values from variables

        System.out.println(container2);
        // do not use "" to access variables


        //Access and print values from all variables--> homework
        //share screenshot in slack


        //Variables are containers, placeholders for values


        // 2. Non primitive data types

        //String

        // String is a sequence/combination/group of characters

        String schoolName = "Syntax";
        String value = "ime";
        System.out.println(sleepy); //false
        System.out.println("sleepy"); //sleepy

        System.out.println(value);


        int year = 2022; //create a variable and store value

        System.out.println(year); //2022

        year = 2023; //reassigning the value of the same box(variable)

        System.out.println(year); //2023


        /* We cannot do  int year = 2022; int year = 2023
         * because the variable can't have the same name (duplicate variables)
         * but we can keep reassigning the value
         */


    }

}
