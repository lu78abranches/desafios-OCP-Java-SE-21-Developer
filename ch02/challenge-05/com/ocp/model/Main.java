package com.ocp.model;

class Main{
	public static void main(String[] args){
	  Document doc = new Document();
	  Photo ph = new Photo();
	  doc.printTwice();
	  ph.printTwice();
	  Printable.info();
	  //doc.info(); not compiles, static method of interface, not access to instances of subclasses
	  //ph.info(); only access with name of interface
	}
}