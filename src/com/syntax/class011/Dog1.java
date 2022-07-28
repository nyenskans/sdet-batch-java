package com.syntax.class11Part2;

public class Dog1 {

	
	
	public static void main(String[] args) {

		int sum=sum(3,5);
		
		
		Dog1 dog1=new Dog1();
		dog1.name="Loki";
		dog1.age=10;
		dog1.breed="Collie boxer mix";
		dog1.color="Brown-white";
		dog1.weight=50;
		dog1.barks();
		dog1.bePet();
		
		Dog1 dog2=new Dog1();
		dog2.name="Risko";
		dog2.age=3;
		dog2.weight=50;
		dog2.color="Black-gray-white";
		dog2.barks();
		dog2.bePet();
	}

	String breed;
	String name;
	int age;
	String color;
	int weight;
	double height;
	
	void barks(){
		System.out.println(name+ " barks");
	}
	void bePet() {
		System.out.println(name +" wants you to pet him.");
	}
	
	public static int sum(int num1, int num2) {
		 int sum=num1+num2;
		return sum;
	}
	
}
