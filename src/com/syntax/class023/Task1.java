package com.syntax.class023;

public class Task1 {
    // Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    // Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'. In Masters class override method 'getPrerequisite'.
    // Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite(); // the output is from Degree class because Inheritance is one way
                                 // meaning if we change it in child class it doesn't affect PArent class
        Bachelors degree1=new Bachelors();
        degree1.getPrerequisite();// the output is same as from Degree class because we Inherit this method from Parent class
        Masters degree2=new Masters();
        degree2.getPrerequisite(); // the output is from Masters class, because the method is overridden
    }
}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }


}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a Master degree you need Bachelors diploma");
    }

}