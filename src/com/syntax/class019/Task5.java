package com.syntax.class019;

public class Task5 {
    /* Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each student's name.
NOTE: please use different names for instance and local variables.
 */

    // we have to use instance variables to be able to access variables from the constructor in the method
    double g1Marks;
    double g2Marks;
    double g3Marks;
    String name;

    Task5(String name, double grad1Marks, double grad2Marks, double grad3Marks) {
        g1Marks = grad1Marks;
        g2Marks = grad2Marks;
        g3Marks = grad3Marks;
        this.name = name;
    }

    public void calculateAvgGrade() {
        double avgGrade = (g1Marks + g2Marks + g3Marks) / 3;
        System.out.println(name + " has the average grade of " + avgGrade);
    }


}
