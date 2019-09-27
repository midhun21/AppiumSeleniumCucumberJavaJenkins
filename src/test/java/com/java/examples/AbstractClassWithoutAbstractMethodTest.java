package com.java.examples;

abstract class abstrA {
	
	public void displayA() {
		System.out.println("Abstract class with Concrete Method only!!!!");
	}
}

public class AbstractClassWithoutAbstractMethodTest extends abstrA{
	public static void main(String[] args) {
	abstrA abstrAObj = new AbstractClassWithoutAbstractMethodTest();
	abstrAObj.displayA();
	}
}
