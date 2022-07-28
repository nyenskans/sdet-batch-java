package com.syntax.class028;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        /*Create a class Insurance that will have an attribute as insuranceName and unimplemented
 behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/

        ArrayList<Insurance> insurances= new ArrayList<>();
        insurances.add(new Pet("Petco", "Dog"));
        insurances.add(new Car("Geico", "Mazda cx5"));
        insurances.add(new Health("Blue"));

    // Print out all methods using for each loop:
        for(Insurance insurance:insurances){
            System.out.println("insurance: "+insurance);
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }


}
abstract
class Insurance{
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
class Car extends Insurance{
    String carModel;
    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("2% of your car price");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel car insurance");
    }
}
class Pet extends Insurance{
    String petType;
    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("50 a month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel Pet insurance");
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("300/Month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Health Insurance cancelled");
    }
}
