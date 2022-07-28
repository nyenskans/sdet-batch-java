package com.syntax.class016;

import com.syntax.class017.Employee;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
        //   System.out.println(ac.password); error because it's void type, it doesn't return anything
        System.out.println(ac.ssn);
        System.out.println(ac.name);

        Employee emp = new Employee(); // java imports com.syntax.class017.Employee; above the code
        String str = new String(); // there is no automatic import--> it means this class comes from java.lang package
        // all clases inside java.lang are imported by default for us

        //if classes exist withing the same package, they are imported automatically, no import is show at the top:
        Dog dog1 = new Dog();

        //  if there are multiple classes with same names within different packages, we get an error so we must specify where to import it from

        Dog dog2 = new Dog();

        System.out.println(dog2);


    }
}
