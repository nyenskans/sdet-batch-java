package com.syntax.class009;

public class Task1 {

    public static void main(String[] args) {


        char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(grade[1]);


        char[] grades = new char[6];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';
        grades[3] = 'D';
        grades[4] = 'E';
        grades[5] = 'F';

        System.out.println(grades[1]);


        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }


    }
}