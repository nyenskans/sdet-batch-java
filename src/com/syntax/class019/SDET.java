package com.syntax.class019;

public class SDET extends Human{
    boolean goodAtJava=true;
    SDET(String name, String eyeColor, String job, int age) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.job = job;
        this.age=age;
        this.goodAtJava=goodAtJava;
    }
void printInfo(){
    System.out.println("My name is "+name+" and I am good with Java- "+goodAtJava);
}

    public static void main(String[] args) {
        SDET sdet=new SDET("Neno", "brown", "software engineer", 31);
        sdet.printInfo();
    }

}
