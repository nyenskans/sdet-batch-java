package com.syntax.class011;

public class Car {

    String model;
    String make;
    String color;
    int year;
    String typeOfEngine;
    int vinNum;
    int doorNo;
    int horsePower;

    void moveForward() {
        System.out.println("Car is moving forward.");
    }

    void reverse() {
        System.out.println("Car is moving in reverse.");
    }

    void park() {
        System.out.println("Car is parked.");
    }


    public static void main(String[] args) {

        Car mazda = new Car();
        mazda.model = "cx5";
        mazda.make = "Mazda";
        mazda.color = "White";
        mazda.doorNo = 5;
        mazda.year = 2018;

        mazda.moveForward();
        mazda.reverse();
        mazda.park();

        System.out.println(mazda.model);
        System.out.println(mazda.color);


        Car lexus = new Car();
        lexus.make = "Lexus";
        lexus.model = "Corolla";
        lexus.doorNo = 5;
        lexus.year = 2015;
        lexus.color = "Black";

        lexus.reverse();
        lexus.moveForward();


    }

}
