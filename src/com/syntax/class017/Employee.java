package com.syntax.class017;

public class Employee {
    // When it's public class Employee--> This class can be accessed everywhere within the project
    // we can create an object of the same class in any other class within the same project

    public String name; //from public class AccessModifiersDemo1
    public static String manager = "John";
    private int salary;
    String department;

    private void printSalary() {
        System.out.println("Salary " + salary);
    }

    void printDepartment() {
        System.out.println("Department " + department);

    }

    public static void printManager() {
        System.out.println(manager);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Loki";
        emp.department = "Treat distribution manager";
        emp.salary = 900000;


    }

}
