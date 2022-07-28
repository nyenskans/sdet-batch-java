package com.syntax.class021;

public class Animal {
    String name;
    String color;
    String breed;
    int age;

    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name: "+name+" color: "+color+" breed: "+ breed+" age: "+age);

    }
}
class Dog extends Animal{ // if we just do extends animal we get an error: create a matching constructor to the constructor in super class
    // constructors are not inherited
    // so we cannot use the method printInfo() until we create it
    // If we hadn't created a constructor in the first class we wouldn't get that error (because java would make default constructors for both classes)


    public Dog(String name, String color, String breed, int age) { // create another constructor
        super(name, color, breed, age); // create a super class constr--> to initialize all fields
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }
}



