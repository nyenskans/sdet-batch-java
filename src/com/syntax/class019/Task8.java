package com.syntax.class019;

public class Task8 {
    /*
    Write a Student class that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    Task8(String name, String address) {
        this.name = name;
        this.address = address;

    }

    void displayInfo() {
        System.out.println(name + " lives at " + address);
    }

    public static void main(String[] args) {
        Task8 task8 = new Task8("Loki", "107 Meadowlands Dr, RPB, FL 33411");
        task8.displayInfo();
    }
}
