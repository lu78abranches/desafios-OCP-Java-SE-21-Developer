package com.ocp.model;

class Main{

	public static void main(String[] args){

		Flyable duck1 = new Duck();
		Swimmable duck2 = new Duck();
		Duck duck = new Duck();
		Swimmable fish = new Fish();
		//Flyable fish1 = new Fish();fish cannot be referenced as Flyable

		duck1.fly();
		duck2.swim();
	}
} 		
