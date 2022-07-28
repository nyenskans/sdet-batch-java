package com.syntax.class005;

import java.util.Scanner;

public class UserInputRecap {

    public static void main(String[] args) {

        // shortcut for Scanner
        //command+shift+4
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = input.next();

        //If we enter more than one string and we used input.next(), the first string will only be saved
        //The rest of the strings will be still in the program, so if we try to enter next var age
        //We will get a type mismatch


        System.out.println("Please enter age");
        int age = input.nextInt();

        System.out.println("Please enter price");
        double price = input.nextDouble();

        System.out.println("Please enter boolean");
        boolean bool = input.nextBoolean();

        System.out.println("Please enter gender");
        char gender = input.next().charAt(0);    //character at index 0, we can change the number

        System.out.println("Please enter address");
        String address = input.next();

        System.out.println(name + age + gender + address);


    }

}
