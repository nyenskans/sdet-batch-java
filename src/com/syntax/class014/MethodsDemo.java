package com.syntax.class014;

import java.util.Scanner;

public class MethodsDemo {

    // Method is a block of code, a group of java statements
    // We can execute those statements together by just creating an object of the class that contains that method
    // and by writing the objects name.method name

    void PrintHello() { // doesnt return any value, only executes a line of code
        System.out.println("How are you?");
    }

    boolean returnTrue() { // returns a value
        return true;
    }

    int returnInt() {
        return 10;
    }
    // methods that don't return any type of value--> always start with void
    // methods that return a value start with the data type


    public static void main(String[] args) {

        MethodsDemo md = new MethodsDemo();
        md.PrintHello();


        Scanner input = new Scanner(System.in); // create an object Scanner of the class Scanner - called input that contains a method
        // input.nextInt(); // we use it by saying name of the object.name of the method


        boolean xs = md.returnTrue();
        int num = md.returnInt();
        System.out.println(num);
        System.out.println(md.returnInt());

        input.close();

    }

}
