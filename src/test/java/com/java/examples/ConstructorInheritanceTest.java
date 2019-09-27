package com.java.examples;

class ParentConstructorClass {
	public ParentConstructorClass() {
		System.out.println("Calling Parent Constructor Class.");
	}
}

class ChildConstructorClass extends ParentConstructorClass {
	public ChildConstructorClass() {
		System.out.println("Calling Child Constructor Class.");
	}
}

public class ConstructorInheritanceTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ParentConstructorClass parentConstObj = new ParentConstructorClass();
		ParentConstructorClass parentConstObj1 = new ChildConstructorClass();
	}
}
