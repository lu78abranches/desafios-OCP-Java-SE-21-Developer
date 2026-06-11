package com.ocp.model;

public class Duck implements Flyable, Swimmable{
	
	@Override
	public void fly(){
	 System.out.println("Duck Flying");
	}
	@Override
	public void swim(){
	 System.out.println("Duck swimming");
	}

}
