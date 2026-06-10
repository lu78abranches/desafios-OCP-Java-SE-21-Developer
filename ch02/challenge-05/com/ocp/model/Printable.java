package com.ocp.model;

public interface Printable{

	void print();

	default void printTwice(){
	  print();
	  print();
	}

	public static void info(){
	 System.out.println("Printable interface");
	}
}
