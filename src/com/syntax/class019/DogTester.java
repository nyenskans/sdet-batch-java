package com.syntax.class019;

public class DogTester {
    public static void main(String[] args) {

        Cat cat=new Cat("kitty", "green");
        cat.printInfo();
        // Cat class doesn't have this method but it gets it from it's parent class
        Dog dog=new Dog("Loki", "brown");
        dog.printInfo();

    }
}
