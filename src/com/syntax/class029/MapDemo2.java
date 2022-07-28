package com.syntax.class029;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> fruit=new TreeMap<>();
        fruit.put("Lemon", 10);
        fruit.put("Apple", 23);
        fruit.put("Peach",11);
        fruit.put("Strawberry",11);


        HashMap<String, Integer> cosmetics=new HashMap<>();
        cosmetics.put("foundation", 100);
        cosmetics.put("lipstick", 100);
        cosmetics.put("blush", 100);
        cosmetics.put("mascara", 100);

        LinkedHashMap<String, Integer> groceries=new LinkedHashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(cosmetics);
        System.out.println(groceries);

    }
}
