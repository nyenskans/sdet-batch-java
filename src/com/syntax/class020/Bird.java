package com.syntax.class020;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    public Bird(String name, String color, int age, double weight) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.weight=weight;

        // This constructor won't be participating in inheritance
        // but we can access it in child class by using
    }

    void printInfo(){
        System.out.println("Name "+name+" Color "+color);
    }
}

class Parrot extends Bird{
    Parrot(String name, String color,int age, double weight){
        super(name, color,age,weight);
    //   this.name=name;
    //   this.color=color;
    //   this.age=age;
    //   this.weight=weight;

    }
}
class Sparrow extends Bird{
  Sparrow(String name, String color, int age, double weight) {
        super(name, color, age, weight); // getting the fields from parent class
    }
}