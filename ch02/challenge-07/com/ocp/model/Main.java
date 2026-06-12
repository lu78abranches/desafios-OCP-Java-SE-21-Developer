package com.ocp.model;

class Main{

	public static void main(String[] args){
		Dog dog = new Dog();
		Cat cat = new Cat();
	
		Animal [] animal =  {dog, cat};

		for(Animal animals : animal){
			animals.sound();
		}
	}
}

		
		
