package com.syntax.class023;

public class Car {
    void start(){
        System.out.println("Use key to start me");
    }
    void stop(){
        System.out.print("Use breaks to stop me");
    }
    void park(){
        System.out.print("Good luck with parallel parking");
    }

}
class BMW extends Car{
    @Override
    void start(){
        System.out.println("Use push button to stop me");
    }
    @Override
    void stop(){
        System.out.println("Use autobreaking or manual breaks to stop me");
    }

}
class Tesla extends Car{
    void start(){
        System.out.println("You can start me from your iPhone app");
    }
    @Override
    void stop(){
        System.out.println("Use autobreaking to stop me");
    }
    void park(){
        System.out.print("You can use my autoparking feature");
    }
}
class Toyota extends Car{

}