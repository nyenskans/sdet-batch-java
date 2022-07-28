package com.syntax.class023;

public  class Animal {
    void eat(){ //if we add keyword final here, it prohibits overriding this method in child classes
       System.out.println("All animals eat");
    }
}
class Panda extends Animal{
    // no other class can inherit from class Animal if we add keyword final to class Animal above
    void eat(){
        System.out.println("All animals eat");
    }
            Panda(){ // constructor
                System.out.println("Child");
            }
}

// In deep multilevel inheritance, creating an object of the last child becomes very expensive--> very slow
// We can make classes final so on one after in hierarchy will be able to use it
// ( not to over use it and then the execution will be a lot slower)

// For variables keyword final will mean they cannot be changed, for example g=9.81
// For methods and classes keyword final will mean they cannot be inherited

class Tester{
    public static void main(String[] args){

        new Panda();
        
    }
}