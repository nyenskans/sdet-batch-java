package com.syntax.class019;

public class Task5Tester {
    public static void main(String[] args) {


        Task5 student1 = new Task5("Loki Pecikoza", 99.5, 99.9, 99);
        student1.calculateAvgGrade();

        Task5 student2 = new Task5("Risko Sibinski", 99, 98, 97);
        student2.calculateAvgGrade();

        Task5 student3 = new Task5("Bobi Susic", 99, 99, 99);
        student3.calculateAvgGrade();

        Task5 student4 = new Task5("Tedi Susic", 98, 98, 100);
        student4.calculateAvgGrade();
    }
}