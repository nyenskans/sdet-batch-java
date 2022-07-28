package com.syntax.class019;

public class Parent {
    String name="Neno";
    double money=100000;
}

class Child extends Parent{
    void printInfo(){
        System.out.println("My full name is "+name); // this variable name is outside the class-->comes from parent class
    }
    void buyCar(){
        System.out.println("Heheheh buying car from papas money for $"+money);
    }
}
// Parent cannot access the child, only vice versa
// We can only inherit from one parent in java
// Multiple classes can inherit from the same class (multiple child classes from one parent class)

class Tester{
    public static void main(String[] args) {
        Child child=new Child();
           child .printInfo();
            child.buyCar();
    }

}