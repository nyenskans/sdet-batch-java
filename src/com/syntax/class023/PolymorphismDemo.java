package com.syntax.class023;



public class PolymorphismDemo {

    void doSomething(String name){
        System.out.println("downloading a movie from the internet "+name);
    }

    void doSomething(int num){
        System.out.println("calculating the text based on new rules");
    }
}

class PolyTester{
    public static void main(String[] args) {
        PolymorphismDemo p=new PolymorphismDemo();
        p.doSomething(10);
    }
}