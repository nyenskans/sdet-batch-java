package com.syntax.class015;

public class Task4 {

    //create a method to say Hello in different languages based on the country that will be passed when a method is executed

    void sayHello(String country) {

        String hello;
        switch (country) {
            case "USA":
                hello = "Hello";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "France":
                hello = "Bonjour";
                break;
            case "Spain":
                hello = "Hola";
                break;
            default:
                hello = "Language not supported";
        }
        System.out.println(hello);
    }


    public static void main(String[] args) {

        Task4 task4 = new Task4();
        task4.sayHello("France");


    }
}