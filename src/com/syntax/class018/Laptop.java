package com.syntax.class018;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public Laptop() {
        System.out.println("Basic construction is happening...");
    }

    ;

    public Laptop(String make) {
        this.make = make;
    }

    public Laptop(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Laptop(String make, String model, String storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public Laptop(String make, String model, String storage, String memory) {
     /*   this.make=make;
        this.model=model;
        this.storage=storage;
      */
        this(make, model, storage);
        this.memory = memory;
    }

    public Laptop(String make, String model, String storage, String memory, double screenSize) {
      /*  this.make=make;
        this.model=model;
        this.storage=storage;
        this.memory=memory;
       */
        this(make, model, storage, memory);
        this.screenSize = screenSize;
    }
    // this code is too long, so we can call a constructor to avoid the repetition of code


    public static void main(String[] args) {
        Laptop apple = new Laptop("apple", "pro", "512mb", "16", 13);

        Laptop laptop = new Laptop();    //creating a new object of Laptop class -->Laptop default constructor
                                        // output is "Basic construction is happening..."
                                       //  because that is the code we included in default constructor on line 11
        new Laptop();  // same output for this line of code as for the one above
    }
}
