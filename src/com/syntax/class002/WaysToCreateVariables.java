package com.syntax.class002;

public class WaysToCreateVariables {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        /* 1st way to create a variable
         * dataType name = value
         * we declared a variable temperature and we initialized it
         */
        int temperature = 60;

        /* 2nd way to create a variable = declare a variable
         * create a variable (dataType and name)
         * then assign value in second step
         */
        int sum; //just created an empty box- variable that has a name but no assigned value
        sum = 30; //assign value; sometimes it might be imported from Scanner or another operation
        sum = 50; //reassign the value of variable sum

        /* 3rd way
         *declare multiple variables of the same type at the same time
         */
        int num1, num2, num3;
        num1 = 10; // assign the value = initialize the variable
        num2 = 20; // assign the value
        num3 = 30; // assign the value

        System.out.println(sum); //output is 50


    }

}
