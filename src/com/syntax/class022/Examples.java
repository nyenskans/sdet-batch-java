package com.syntax.class022;

public class Examples {

    public static void main(String[] args) {
   /*    int age=10;
        String name;
         if(age>18){
            name="Time to go to work";
        }else{
            name="Enjoy no work";
        }
        System.out.println(name);*/


// Ternary operator

       int age=19;
        String name=age>18?"Time to go to work":"Enjoy no work"; // Short way of writing if else
        System.out.println(name);

        String name1=age>18? age>10?"Nested if":"it is nested if":"Enjoy no work"; // Short way of writing nested if else
        System.out.println(name1);
    }

}
