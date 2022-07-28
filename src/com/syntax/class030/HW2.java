package com.syntax.class030;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HW2 {
    public static void main(String[] args) {
                /*
        Create a map of countries with its capital that will
        store countries in alphabetical order.
        - Print all keys and values from a country map using for each loop and iterator.
        - Print all values from a country map using for each loop and iterator.
         */


        TreeMap<String, String> countryCapitalMap = new TreeMap<>();
        countryCapitalMap.put("Spain", "Madrid");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Italy", "Rome");
        countryCapitalMap.put("England", "London");
        countryCapitalMap.put("Portugal", "Lisbon");

        //countryCapitalMap.entrySet()--> a set of entry values
        // Entry object has a method .getKey() and .getValue()

        // Maps don't store individual elements, they store Entry object--> which are pairs of keys and values

        for(Map.Entry<String, String> entry: countryCapitalMap.entrySet()){
            System.out.println("Entry key: "+entry.getKey()+", entry value: "+entry.getValue());
        }
        System.out.println("----------------------------------------------------------------");


        // using iterator:
        Iterator<Map.Entry<String, String>> iterator = countryCapitalMap.entrySet().iterator(); // iterator of entries
         //   Map.Entry<String, String>  --> A map entry (key-value pair)
        while(iterator.hasNext()){
            Map.Entry<String, String> entry=iterator.next();
            System.out.println("Entry key = "+entry.getKey()+", Entry value = "+entry.getValue());
        }
        System.out.println("----------------------------------------------------------------");

        // if we only want to get values from a Map they return in the form of a Collection
        Collection<String> values=countryCapitalMap.values();
        System.out.println(values);
        for(String capital:values){
            System.out.println("Capital from for each loop: "+capital);
        }
        System.out.println("----------------------------------------------------------------");
        Iterator<String> iterator1 = countryCapitalMap.values().iterator();
        while(iterator1.hasNext()){
            System.out.println("Capitals from iterator: "+ iterator1.next());
        }

    }
}
