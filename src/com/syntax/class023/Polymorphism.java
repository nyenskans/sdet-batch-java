package com.syntax.class023;

public class Polymorphism {
    void doSomething(String name){
        System.out.println("Download a movie");
    }
    void doSomething(int num){ // overloading
        System.out.println("Calculating something based on input");
    }
}
class PolyTester1{
    public static void main(String[] args) {
        Polymorphism poly=new Polymorphism();
        poly.doSomething(10); // this is how we achieve polymorphism by overloading
    }
}
class Polytester2 extends Polymorphism {
    void doSomething(String name) {
        System.out.println("Go to the park"); //this is how we achieve polymorphism by overriding
    }
}