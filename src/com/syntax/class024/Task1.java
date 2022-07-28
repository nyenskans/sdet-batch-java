package com.syntax.class024;

public class Task1 {

    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */


}
class Student{

    void doHomework(){
        System.out.println("Students should do homework");
    }
    void study(){
        System.out.println("Students should study");
    }
    void practice(){
        System.out.println("");
    }


}

class SyntaxStudent extends Student{
   /*
         void study(){  // if we wanted the code to be the same as in parent code this is what we would be doing
        super.study();
    }*/

void study(){   // we are overriding the parent class method
    System.out.println("Syntax students must learn programming");
}

void doHomework(){
    System.out.println("Syntax students must solve repls to get a good job");
}
void practice(){
    System.out.println("Syntax students must practice to get a good job");
}
}


class CollegeStudent extends Student{
void practice(){
    System.out.println("College students must practice to get good grades");
}
}


class SchoolStudent extends Student{

}