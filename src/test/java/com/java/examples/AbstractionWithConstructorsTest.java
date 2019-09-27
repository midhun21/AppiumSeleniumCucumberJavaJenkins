package com.java.examples;

abstract class Shape {
	// Constructor
	public Shape() {
		System.out.println("Calling Shape Class Constructor");
	}

	// Abstract Method
	abstract void draw();
	
	// Non-Abstract Method
	public void defineShape() {
		System.out.println("Define the Shape of....");
	}
}

class Rectangle extends Shape {
	// Constructor
	public Rectangle() {
		System.out.println("Calling Rectangle Class Constructor");
	}

	// Implementation of Abstract method
	public void draw() {
		System.out.println("Drawing Rectangle!!!");
	}

	// Non-Abstract Method
	public void aboutRectangle() {
		System.out.println("All about Rectangle!!!");
	}
}

class Circle extends Shape {
	// Constructor
	public Circle() {
		System.out.println("Calling Circle Class Constructor");
	}
	
	// Implementation of Abstract method
	public void draw() {
		System.out.println("Drawing Circle!!!");
	}

	// Non-Abstract Method
	public void aboutCircle() {
		System.out.println("All about Circle!!!");
	}
}

public class AbstractionWithConstructorsTest {
	public static void main(String[] args) {
		Shape shapeRectangle = new Rectangle();
		shapeRectangle.draw(); // Calls Rectangle class Abstract method draw()

		Shape shapeCircle = new Circle();
		shapeCircle.draw(); // Calls Circle class Abstract method draw()

		Rectangle rectangle = new Rectangle();
		rectangle.draw(); // Calls Rectangle class Abstract method draw()
		rectangle.aboutRectangle(); // Calls Rectangle class Non-Abstract method aboutRectangle()

		Circle circle = new Circle();
		circle.draw(); // Calls Circle class Abstract method draw()
		circle.aboutCircle(); // Calls Circle class Non-Abstract method aboutCircle()

		// Compile time error
		// shapeRectangle.aboutRectangle();
		// shapeCircle.aboutRectangle();
	}
}
