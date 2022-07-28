package com.syntax.class018;

public class Car {     // constructor demo
    private String make;
    private String model;
    private String color;

    // fields should be private for privacy of information
    public Car(String carMake, String carModel, String carColor) { // we pass the values we wish through this parameter list in the constructor
        // if private
        make = carMake;
        model = carModel;
        color = carColor;
    }

    void printCarModel() {
        System.out.println("Model " + model);
    }

    public Car(String carModel) {
        model = carModel;
    } // if we want to create an object which only has model information we can create a different constructor with just that parameter
    // we can also create a method that only contains that one information

    void printInfo() {
        System.out.println("Car make is " + make + ", model is " + model + ", color is " + color);
    }
    // we can have multiple constructors in the same class because we can create many different objects with different parameters
// We can create another constructor with the same name that doesn't take any parameters


// public Car(String carMake){   }      // We can't have 2 constructors with the same number of parameters and same type because java won't know which constructor to call


}



