package com.syntax.class022;

public class Task3 {
//    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
//    then the message "I love programming languages" should be printed.
//    If some String is passed to it, then in place of "programming languages" ]
//    the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed


}
class Programming{
    Programming(){
        System.out.println("I love java");
    }
    Programming(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("I am a student");
    }
}