package com.syntax.class018;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String cowBreed, String cowColor, int cowAge, double cowWeight) {
        // when we have same name variable as local and as instance inside the class
        // local is always preferred by java inside block of code
        //If we name them the same it says: Variable 'breed' is assigned to itself --> so we can't use the constructor in another class__>Cow tester
// so we have to use different names for instance and local variables
      /*
       breed=breed;
       color=color;
       age=age;
       weight=weight;
       we can do it but we have to add this.breed=breed
       */
        this.breed = breed; // This means that we want java to use instance var instead of preffered local var -->
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    String printInfo() {
        return "Breed: " + breed + ", color: " + color + " age: " + age + " weight: " + weight;
    }
}
