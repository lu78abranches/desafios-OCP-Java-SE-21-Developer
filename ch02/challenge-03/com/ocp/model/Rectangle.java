package com.ocp.model;

class Rectangle extends Shape{

	double width;
	double height;

	public Rectangle(String color){
	   super(color);
	}

	@Override
	public double area(){
	return width * height;
	}
}