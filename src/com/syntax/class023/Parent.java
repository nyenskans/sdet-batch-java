package com.syntax.class023;

public class Parent {

    public static void eat(){
        System.out.println("I like to eat veggies");
    }
    public static void sleep(){
        System.out.println("I like to sleep 9 hours");
    }

    public static void activity(){
        System.out.println("I like to go to the beach");
    }

}

class Child extends Parent{
    public static void activity(){
        System.out.println("I like to go to the pool"); // we redeclared the static method
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child child = new Child();
        child.eat();
        child.activity(); // output is redeclared method
        Parent parent = new Parent();
        parent.activity(); // output is the initial method
    }

}
