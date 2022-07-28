package com.syntax.class017;

public class Task2Students {
   /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
    */

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task2Students students = new Task2Students();
        students.name = "Loki";
        students.id = "007";
        //   students.numberOfStudents=1 // intellij gives a message that there is a better way of doing it:

        numberOfStudents = 1;
        // If we are inside the same class
        // we can just call it by writing name of variable without object because the var is static and method is static
        System.out.println(students.name);
        System.out.println(students.id);
        System.out.println(numberOfStudents); // same thing

        numberOfStudents = 2;
        Task2Students students2 = new Task2Students();
        students2.name = "Riki";
        students2.id = "008";
        System.out.println(students2.name);
        System.out.println(students2.id);
        System.out.println(numberOfStudents); // same thing

    }
}
