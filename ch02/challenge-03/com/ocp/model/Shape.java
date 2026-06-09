package com.ocp.model;

abstract class Shape{
	String color;

	public Shape(String color){
	   this.color = color;
	   System.out.println("Shape Created");
	}

	public void describe(){
	  System.out.println("A cor é:" + color);
	}

	public abstract double area();
}