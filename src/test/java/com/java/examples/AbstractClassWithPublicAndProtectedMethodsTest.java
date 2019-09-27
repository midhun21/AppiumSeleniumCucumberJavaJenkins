package com.java.examples;

abstract class classWithPublicAndProtectedMethods {

	abstract void thisIsAPublicAbstractMethod();

	abstract void thisIsAProtectedAbstractMethod();
}

class childClass extends classWithPublicAndProtectedMethods {

	@Override
	public void thisIsAPublicAbstractMethod() {
		System.out.println("This is a Public method");
	}

	@Override
	protected void thisIsAProtectedAbstractMethod() {
		System.out.println("This is a Protected method");
	}
}

public class AbstractClassWithPublicAndProtectedMethodsTest {

	public static void main(String[] args) {
		classWithPublicAndProtectedMethods parentObj = new childClass();
		parentObj.thisIsAPublicAbstractMethod();
		parentObj.thisIsAProtectedAbstractMethod();

		childClass childObj = new childClass();
		childObj.thisIsAPublicAbstractMethod();
		childObj.thisIsAProtectedAbstractMethod();
	}
}