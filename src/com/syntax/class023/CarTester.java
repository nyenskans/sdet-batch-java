package com.syntax.class023;

public class CarTester {
    public static void main(String[] args) {

        Car car1=new Tesla();

        /// Type casting for non-primitive data types
     // Tesla tesla=new Car(); error because not all cars are tesla this is narrowing and it's not possible with classes (and other non primitives)

        car1.start(); // the output will be method from Tesla because we did--> car = new Tesla() and that method is overridden in Tesla class
        car1=new Toyota(); //reassigning the value from Tesla() to Toyota()
        car1.start(); // output is from Car class because the method is not overridden in Toyota

    /*
        BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.park();
        tesla.stop();
        Toyota toyota=new Toyota();
        toyota.park();
        toyota.start();
        toyota.stop();
        */

        // With the use of polymorphism we can reduce the amount of code ABOVE

       /*
        Car car=new BMW();
        car.start();
        car.stop();
        car.stop();
        */

// SO NOW WE CAN JUST REPLACE THE OBJECT BMW WITH TESLA/TOYOTA AND THEY WILL EXECUTE THE SAME
// A GOOD EXAMPLE OF THIS USAGE IN TESTING IS TESTING WEBSITE FEATURES IN DIFFERENT BROWSERS

        Car[] cars={new BMW(), new Tesla(), new Toyota()};
        // we create an array of objects
        for(Car c:cars){
            c.start();
            c.stop();
            c.park();
        }

    }
}
