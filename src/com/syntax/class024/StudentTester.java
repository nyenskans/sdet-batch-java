package com.syntax.class024;

public class StudentTester {
    public static void main(String[] args) {

        Student[] students={new SyntaxStudent(), new CollegeStudent(),new SchoolStudent()};
        // making an array that contains all new objects
        for(Student st:students){
            st.study();
            st.doHomework();
            st.practice();
            // output is 9 methods- 3 objects * 3 methods
        }

        // same thing using regular for loop
        for(int i=0; i< students.length;i++){
            students[i].study();
            students[i].practice();
            students[i].doHomework();
        }


    }
}
