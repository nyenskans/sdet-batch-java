package com.syntax.class024;

// Abstraction examples

public abstract class Phone {                    // we only define the requirements not the code

    abstract void displayPictures(); // I don't want to write the code, I just want to make child class implement it
                                     // error:Abstract method in non-abstract class--> we have to add abstract to class also

    abstract void unlock();

    // we can have implemented methods within an abstract class
    void sendText(){
        System.out.println("Use messaging app to send a text message");
    }

}
class Iphone extends Phone {
    // error: Class 'Iphone' must either be declared abstract or implement abstract method 'displayPictures()' in 'Phone'
    //we must implement all the abstract methods, or we'll still get the same error
// this way we force the requirements to be fulfilled in the child classes
    void displayPictures() {
        System.out.println("Use Photos app to display the pictures");
    }

    void unlock() {
        System.out.println("Use FaceId to unlock the iPhone");
    }
}
class Samsung extends Phone{
    // right click -->generate--> implement methods/override
    @Override
    void displayPictures() {
        System.out.println("Use Gallery app to access pictures");
    }

    @Override
    void unlock() {
        System.out.println("Use FingerPrint to unlock your phone");
    }
}
class Tester{
    public static void main(String[] args) {

 //Samsung samsung=new Samsung(); // error 'Samsung' is abstract; cannot be instantiated
                                     // we cannot create objects of abstract classes --> only of concrete classes
// because if we created these object we would be able to call its abstract method which don't have a body and therefore cannot be executed
// once those methods were completed then we can use them and objects of those classes


        // after we've implemented methods in Samsung class we can create a new object of Samsung class:

        Samsung samsung=new Samsung();
        samsung.unlock();

        }
}