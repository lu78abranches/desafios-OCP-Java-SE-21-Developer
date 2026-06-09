package com.ocp.model;

class Main{
	public static void main(String[] args){
		Circle cir = new Circle("Roxo");
		Rectangle rec = new Rectangle("Verde");
		cir.radius = 10;
		System.out.println(cir.area());
		rec.area();
		System.out.println(rec.area());
		//Shape shape = new Shape();//not compiles, abstract class can`t be instantieted
	}
}