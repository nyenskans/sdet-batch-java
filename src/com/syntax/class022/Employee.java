package com.syntax.class022;

public class Employee {
    String name;
    int baseSalary=30000;
    int baseHoliday=10;

    void calculatePrintSalary(){
        System.out.println(baseSalary);
    }
    void calculatePrintHolidays(){
        System.out.println(baseHoliday);
    }

}
class OfficeWorker extends Employee{

}
class Manager extends Employee {
    void calculatePrintSalary() {
        System.out.println(baseSalary * 4 + 20000);
    }

    void calculatePrintHolidays() {
        System.out.println(baseHoliday * 3);
    }

}
class QA extends Employee {
    @Override // annotation helps the compiler
    // it can help us also- if we make a mistake while overriding-java will give us te error
    void calculatePrintSalary() {
        System.out.println(baseSalary * 2 + 20000);
    }

    void calculatePrintHolidays() {
        System.out.println(baseHoliday * 3);
    }
}
class Developer extends Employee {
    void calculatePrintSalary() { // this red upward arrow means this method is overriding the one in parent class
        System.out.println(baseSalary * 2 + 30000);
    }

    void calculatePrintHolidays() {
        System.out.println(baseHoliday * 2);
    }
}

