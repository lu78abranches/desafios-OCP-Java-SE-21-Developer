package com.ocp.model;

class Rectangle extends Shape{

	double width;
	double height;

	@Override
	public double area(){
	return width * height;
	}
}