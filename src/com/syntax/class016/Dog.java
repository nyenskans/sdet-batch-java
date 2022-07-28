package com.syntax.class016;

public class Dog {
    // creating  multiple objects
    // each object will have a different value for the created objects
    // That means we shouldn't create a static variable
    //We should create an instance variable since each object will have its own copy
    //If we do static :
    static String name; //one memory location declared for var name--> so it can only hold one value at a time
    String color;
    String name1;
    static int numOfLegs = 4; //--> it will always be the same, so best to use static variable

    public static void main(String[] args) {
        Dog dog1 = new Dog(); // creating a new object of Dog class
        dog1.name = "Loki";
        dog1.color = "brown";
        dog1.name1 = "Loki";
        Dog dog2 = new Dog();
        dog2.name = "Risko";
        dog2.color = "black-white";
        dog2.name1 = "Risko";

        Dog dog3 = new Dog();
        dog3.name = "Bobi";
        dog3.color = "black";
        dog3.name1 = "Bobi";

        Dog dog4 = new Dog();
        dog4.name = "Tedi";
        dog4.color = "yellow";
        dog4.name1 = "Tedi";


        System.out.println(name); // only the last assigned value will print out, not all the assigned values; same bellow:
        // it is not possible to retrieve all the values

        // System.out.println(color);  we get an error: java: non-static variable color cannot be referenced from a static context

        //but we can access instance variables in static methods via creating objects, just not directly:
        System.out.println(dog1.color);
        System.out.println(dog3.color);
        // if color was static variable, we would only get one output for color-->last one assigned

        System.out.println(dog1.name);
        System.out.println(dog2.name);

        // we should only create a static variable when we know something will always stay the same inside all objects of a class
        // the advantage of that is much less memory


        //when we created instance variable name1--> we get each value of the variable
        System.out.println(dog1.name1);
        System.out.println(dog2.name1);


    }
}
