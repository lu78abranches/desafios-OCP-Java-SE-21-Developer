package com.ocp.model;

abstract class Shape{
	String color;

	public void describe(){
	  System.out.println("A cor é:" + color);
	}

	public abstract double area();
}
	  
	