package com.syntax.class016;

import com.syntax.class017.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Jane";
        //  employee.salary --> error, its private variable
        // employee.department-->error, its default variable from a different package (class17)
        System.out.println(employee.manager);
        Employee.printManager();
        //Static fields and methods can be accessed by only writing the name of the class . method_name without sysout
    }
}
