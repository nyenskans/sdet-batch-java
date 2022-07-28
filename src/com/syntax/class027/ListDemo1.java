package com.syntax.class027;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // we can store the object of a class inside a variable of type
        List<String> legends=new ArrayList<>();
        legends.add("Loki");

        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Risko"));

  //      String[] arr=legends.toArray(); we cannot directly convert array list to array
  //                                      because [] type is String and the return is array of objects
 //                                      so we have to use casting:
 //       String[] arr= (String[]) legends.toArray();
        legends.add("Risko");
        legends.add("Tedi");
        legends.add("Bobi");

   //     System.out.println(arr[0]);
        System.out.println(legends);
        legends.remove("Risko");
        System.out.println(legends);

        List <String> someStudents=new ArrayList<>();
        someStudents.add("Loki");
        someStudents.add("Bobiska");

        //with this method we are checking if all elements of List legends present in someStudents list
        System.out.println(legends.containsAll(someStudents));










    }
}
