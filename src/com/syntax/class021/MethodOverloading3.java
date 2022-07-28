package com.syntax.class021;

public class MethodOverloading3 {
    void method(){
        System.out.println("1");
    }
  /*  void method(){ // error because both have 0 parameters
        System.out.println("1");
    }
   */
    void method(String name){
        System.out.println("2");
    }
    void method(String name, int num){
        System.out.println("3");
    }
    void method(int num1, int num2){ // same number of parameters as previous but different datatypes
        System.out.println("4");
    }
    void method(int num,String name){// same number of parameters as previous but different sequence of parameters
        System.out.println("3");
    }
// exactly the same rule as for constructors
    public static void main(String[] args) {
        MethodOverloading3 m=new MethodOverloading3();
        m.method("Loki",6); // java recognizes which method we're calling by the number and type of parameters we enter
        m.method();
    }
}
