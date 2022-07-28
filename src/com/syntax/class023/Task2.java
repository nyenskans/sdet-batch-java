package com.syntax.class023;

public class Task2 {
//    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
//            Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//    Call the method by creating an object of each of the three classes.

public static void main(String[] args) {
    CreditCard creditCard=new CreditCard(1000,2);
    creditCard.calculateInterest();
    Visa visa=new Visa(2000, 2.1);
    visa.calculateInterest();
    AX amex=new AX(3000, 2.4);
    amex.calculateInterest();
}
}
class CreditCard{
    double balance;
    double interest;

    // we have instance fields that we are using in the method we should make a Constructor as well
    public CreditCard(double balance, double interest) {
        this.balance = balance; // we use this to call current class variables
        this.interest = interest;
    } // mark the instance variable, right click--> generate--> constructor (for automatic creation of constructor)

    public void calculateInterest(){
        System.out.println("Interest amount is $"+(balance*interest/100));
    }

}
class Visa extends CreditCard{ // we get an error so we have to make another Constructor with matching parameters from parent class

    public Visa(double balance, double interest) {
        super(balance, interest); // we are calling the parent class constructor so that these fields get initializes
    }
}
class AX extends CreditCard { // we get an error again so we have to make another Constructor with matching parameters from parent class
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest(){
            System.out.println("Interest amount is $"+(balance*interest/100+5));
        }

    }
