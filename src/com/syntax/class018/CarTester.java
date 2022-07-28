package com.syntax.class018;

public class CarTester { // main for class Car--> always create separate classes with main method

    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "cx-5", "white"); //now we have to pass parameters since we defined them in constructor
        car1.printInfo(); //output is --> Car make is Mazda, model is cx-5, color is white
        Car car2 = new Car("Hyndai", "Santa Fe", "grey");
        car2.printInfo();//output is --> Car make is Hyndai, model is Santa Fe, color is grey

        Car car = new Car("Tesla"); // the constructor we created in class Car with only 1 parameter
        car.printCarModel();
        // We can't have 2 constructors with the same number of parameters because java won't know which constructor to call
    }
}
