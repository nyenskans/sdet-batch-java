package com.syntax.class028;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Orange");
        System.out.println(fruit);
    }
}
