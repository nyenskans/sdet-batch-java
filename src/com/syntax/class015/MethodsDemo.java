package com.syntax.class015;

public class MethodsDemo {

    void method() {
        System.out.println("I can use print statement in a void type method");
        int num = 0;
        //   return 0; we get an error if we try to insert return statement--> void has no return

    }

    public static void main(String[] args) {
        MethodsDemo methodsDemo = new MethodsDemo();
        //  int x=methodsDemo(); we get an error because methods with void return type can't be assigned to variables
    }
}
