package com.ocp.model;

class Circle extends Shape{
	double radius;

	public Circle(String color){
	  super(color);
	}
	
	@Override
	public double area(){
	  return Math.PI * radius * radius;
	}
}