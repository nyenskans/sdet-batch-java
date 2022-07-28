package com.syntax.class022;

public class Task2 {
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */

    static void sayHello(){
        System.out.println("Hello Batch13");
    }
    static void sayHello(String message){
        System.out.println(message);
    }
    static void sayHello(String message, int numOfTimes){
        for(int i=0; i<numOfTimes; i ++){
            System.out.println(message);

        }
    }

}
