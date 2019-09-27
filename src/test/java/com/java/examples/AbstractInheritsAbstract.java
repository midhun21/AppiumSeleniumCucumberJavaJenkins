package com.java.examples;

abstract class ParentAbstClass {

	// Abstract Method
	abstract void parentAbstMethod();

	// Abstract Method not implemented in the sub class
	abstract void unImplementedMethod();
}

abstract class ChildAbstClass extends ParentAbstClass {
	// Abstract method
	abstract void childAbstMethod();

	// Implements abstract class
	public void parentAbstMethod() {
		System.out.println("Overriding parentAbstMethod() method in ChildAbstClass");
	}

	public void independentChildMethod() {
		System.out.println("Child method is independent of the parent.");
	}
}

class GrandChildClass extends ChildAbstClass {
	// Non Abstract Method
	public void grandChildMethod() {
		System.out.println("Child of ChildAbstClass");
	}

	// Implements abstract class of parent
	public void childAbstMethod() {
		System.out.println("Overriding childAbstMethod() method of ChildAbstClass in GrandChildClass");
	}

	// Implements abstract class ofr grandparent
	public void parentAbstMethod() {
		System.out.println("Overriding parentAbstMethod() method in GrandChildClass");
	}

	// Implements abstract class of grandparent
	void unImplementedMethod() {
		System.out
				.println("GrandChildClass should implement this method or else declar GrandChildClass as ABSTRACT!!!");
	}

}

public class AbstractInheritsAbstract {
	public static void main(String[] args) {

		ParentAbstClass parentGrandChildObj = new GrandChildClass();
		parentGrandChildObj.parentAbstMethod();

		ChildAbstClass childsChildObj = new GrandChildClass();
		childsChildObj.childAbstMethod();
		childsChildObj.parentAbstMethod();

		GrandChildClass grandChildObj = new GrandChildClass();
		grandChildObj.childAbstMethod();
		grandChildObj.parentAbstMethod();
		grandChildObj.grandChildMethod();
		grandChildObj.unImplementedMethod();
	}
}
