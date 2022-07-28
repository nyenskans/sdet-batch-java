package com.syntax.class017;

public class Task1SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects

     */
    // The following have to be instance variables because they will have different values for each object of the class
    // And because we have to share these variables between 2 or more methods of that class
    String empId;
    int salary;

    static String CEO = "Sumair";

    public static void main(String[] args) {
        Task1SyntaxEmployee emp1 = new Task1SyntaxEmployee();
        emp1.empId = "123";
        emp1.salary = 20000;
        Task1SyntaxEmployee emp2 = new Task1SyntaxEmployee();
        emp2.empId = "1234";
        emp2.salary = 22000;

        System.out.println(emp1.empId);
        System.out.println(emp1.salary);
        System.out.println(emp2.empId);
        System.out.println(emp2.salary);
    }
}
