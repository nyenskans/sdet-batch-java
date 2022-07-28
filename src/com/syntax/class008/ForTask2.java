package com.syntax.class008;

public class ForTask2 {

    public static void main(String[] args) {

        int sum = 0;

        // declaring and initializing a variable


        for (int i = 1; i < 6; i++) {
            // initializing; condition; increment
            sum += i;            //reassigning the value of variable sum

            //sum=sum+i
            //0=0+1
            //sum=1+2
            //sum=3+3
            //sum=6+4
            //sum=10+5
            //sum=15; i=6 condition is false, java exits the loop and executes sysout

        }
        System.out.println(sum);


        // We only get one output since Sysout is outside the loop
        System.out.println("");
        System.out.println("--------------------");


        for (int i = 1; i < 6; i++) {
            sum += i;
            System.out.println(sum + " ");
            /*
             * When this code is inside the for loop it will print
             * each step in the loop (each sum in each iteration)
             */
        }
        System.out.println("");
        System.out.println("--------------------");


        for (int i = 1; i < 6; i++) {
            System.out.print(sum + " ");
            sum += i;

        }

        System.out.println("");
        System.out.println("--------------------");


    }
}
