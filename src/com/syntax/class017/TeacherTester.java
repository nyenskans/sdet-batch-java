package com.syntax.class017;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Zombie";
        teacher.schoolName = "Syntax";
        //Because printInfo is public, we can call it in other classes
        // and because it's part of teacher class it can access the private fields
        //which in turn let us access those fields-->private int salary we access through public printInfo()

        teacher.printInfo();
    }

}
