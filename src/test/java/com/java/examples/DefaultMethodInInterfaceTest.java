package com.java.examples;

interface Drawable {
	public void draw();
	default void message() {
		System.out.println("Default Method in an Interface!!!");
	}
}

class Square implements Drawable {
	
	@Override
	public void draw() {
		System.out.println("Draw a Square!!!!");
	}
}
 
public class DefaultMethodInInterfaceTest{

	public static void main(String[] args) {
		Drawable dObj = new Square();
		dObj.draw();
		dObj.message();
	}
}
