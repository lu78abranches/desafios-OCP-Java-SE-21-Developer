package com.ocp.model;

class Main{

	public static void main(String[] args){
		Dog dog = new Dog();
		Cat cat = new Cat();
	
		Animal [] animal =  {dog, cat};

		for(Animal animals : animal){
			animals.sound();
		}
		Animal a = new Dog();  // upcasting implícito
		Dog d = (Dog) a;       // downcasting explícito — compiles because obj a belongs to subclass Dog
		//Cat c = (Cat) a;       // compila? roda? not compiles, object a not belongs to subclass Cat, throw exception in runtime java.lang.ClassCastException

		if(a instanceof Dog) {
    			System.out.println("A Dog is a Animal");
		}
		if(a instanceof Dog d2) {
    			d2.sound();
		}
		
	}
}

		
		
