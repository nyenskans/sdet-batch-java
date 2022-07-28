package com.syntax.class015;

public class Variables {

    public static void main(String[] args) {

        Variables variables=new Variables();
        variables.printName();

    }
    int num=10; //instance variable
    // all the methods can access this variable
    // if it was placed inside one of the method they would only be accessible inside that method

    void method1(){
        System.out.println(num);
      // error: variable not accessible in this method:  System.out.println(num2);

    }

    void method2(){
        System.out.println(num);
        int num2=20;
        //local variable
        //can only be used within this method
        System.out.println(num2);
    }
    void printName(){
        String name="Local";
        System.out.println(name);
    }

}
