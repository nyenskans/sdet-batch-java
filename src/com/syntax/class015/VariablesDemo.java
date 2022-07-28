package com.syntax.class015;

public class VariablesDemo {
    static int num=5;
    String name;
  //  static variables are available to all the objects of the same class

    public static void main(String[] args) {
        VariablesDemo variable=new VariablesDemo();
        variable.name="Katarina";
        VariablesDemo variable1=new VariablesDemo();
        variable1.name="Neno";
        VariablesDemo variable2=new VariablesDemo();
        variable2.name="Loki";
        System.out.println(variable.name);
        System.out.println(variable.num); // output is 5
        System.out.println(variable1.num); // output still 5

        variable1.num=19; //we update the value of num through object variable1
        System.out.println(variable.num); // output is 19
        System.out.println(variable1.num); // output again 19

    }
}
