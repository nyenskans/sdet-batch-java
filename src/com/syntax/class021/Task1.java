package com.syntax.class021;

public class Task1 {
    /*
Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
 */


}
class UserClass{
    String name;
    String mobileNumber;

    public UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends UserClass{ // we get an error so we have to create a matching super constructor
                                // if there are multiple constructor in parent class there has to be at least one(ANY) matching constructor in child class
    String userAddress;

     UserInfo(String name, String mobileNumber, String userAddress) { // this new constructor can have additional fields
        super(name, mobileNumber); // has to be the first line after the constructor
    }
    void printInfo(){
        System.out.println("Name "+name+" mobile number "+mobileNumber+" user address "+userAddress);
    }

}

