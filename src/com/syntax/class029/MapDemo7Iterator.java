package com.syntax.class029;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7Iterator {
    public static void main(String[] args) {
        // in this case we use method .entrySet() because we have conditions for both key and value
        // this time using iterator
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 20.0);
        fruit.put("Orange", 10.0);
        fruit.put("Kiwi", 34.0);
        fruit.put("Banana", 9.0);
        fruit.put("Apple", 12.0);
        fruit.put("Mango", 42.0);
        fruit.put("Watermelon", 27.0);


        Iterator<Map.Entry<String, Double>> iterator = fruit.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Double> en = iterator.next();
            if(en.getKey().contains("e")&&en.getValue()>15){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
