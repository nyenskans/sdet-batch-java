package com.syntax.class025;

public interface Animal {
    void sleep();
    void eat();

}
interface Dog extends Animal{

    void bark();

}
class Husky implements Dog {

    @Override
    public void sleep() {
        System.out.println("Sleeps 4 hours");
    }

    @Override
    public void eat() {
        System.out.println("Eats a lot of  meat");

    }

    @Override
    public void bark() {
        System.out.println("Dogs favorite thing");
    }
}