package com.syntax.class022;

public class EmployeeTester {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.calculatePrintSalary();

        OfficeWorker officeWorker=new OfficeWorker();
        officeWorker.calculatePrintSalary(); // this class isn't overriding this method so we'll get the output from employee class
    }
}
