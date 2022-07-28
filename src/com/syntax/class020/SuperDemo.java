package com.syntax.class020;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor(); // preferred is local variable if there are the same--> output is gray
                            // if we want to use the instance var instead we use Super keyword
        }
    }

class Wood{         // super class for class Furniture
    String color = "Blue";
}

class Furniture extends Wood{ // super class==parent class
                            /// Immediate parent for class Chair
    String color="black";   // if we delete this, the output for super.color in Chair will be blue. otherwise it will be black

}
class Chair extends Furniture{
    String color = "gray";
    void printColor(){
        System.out.println(color);
        System.out.println(this.color);   // color value from this class (Chair)
        System.out.println(super.color); // adding keyword super, it means we want the value of var color from super class
                                        // which will be black (from immediate parent class Furniture)

        // Using keyword super we can only refer to the immediate parent, not grandparent
    }
}