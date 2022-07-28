package com.syntax.class11Part2;


public class Dog {
	// Blueprint with which we design how an object will look like and how it will behave

	// Class dog
	
	// Attributes- what the Dog is like:
	
	String name;
	int age;
	double weight;
	double height;
	String color;
	String breed;
	
	//	Methods - what the class Dog does/ how it behaves
	
	void bark() {
		System.out.println("Dog barks");
	}
	
	void walks() {
		System.out.println("Dog walks");
	}
	
	void eat() {
		System.out.println("Dog likes to eat bones");
	}
		
	
	public static void main(String[] args) {
		
	//	Scanner input=new Scanner(System.in);
		// command + click to open Scanner class and see code
		
		
		
		Dog loki=new Dog(); // creating an object and storing in a variable
		// variable loki can only be stored in a new variable of the same type (Dog)
		// new Dog() is how we create an object
		
		loki.name="Loki";
		loki.age=10;
		loki.weight=45;
		loki.color="brown";
		loki.breed="collie/boxer";
		loki.height=2.6;
		loki.bark();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
