package com.syntax.class018;

public class ThisKeywordDemo {
    String name = "instance";

    void printName() {
        String name = "local";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisKeywordDemo t = new ThisKeywordDemo();
        t.printName(); // first output line is local because local var is preferred
                    // second output line is instance because we used keyword this so java knows we want to use instance var instead of preferred local


    }
}
