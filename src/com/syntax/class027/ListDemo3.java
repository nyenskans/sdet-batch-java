package com.syntax.class027;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends= new ArrayList<>(); //recommended
        legends.add("Loki"); //0
        legends.add("Risi"); //1
        legends.add("Bobi"); //2
        legends.add("Tedi"); //3
        legends.add("Mica");
        legends.add("Srecko");
        legends.add("Loki");
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);

        legends.set(0,"Lokac"); // replaces an index
        System.out.println(legends);
        System.out.println(legends.indexOf("Mica"));
        System.out.println(legends.lastIndexOf("Loki"));

        System.out.println(legends.subList(0,3)); //3-0=3

    }
}
