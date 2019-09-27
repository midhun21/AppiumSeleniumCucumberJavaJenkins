package com.java.examples;

class Animal1 {
	public void eat() {
		System.out.println("Animal Eats...");
	}
}

class Dog1 extends Animal1 {
	@Override
	public void eat() {
		System.out.println("Dog Eats...");
	}
}

public class MultiLevelInheritanceWithPolymorphismWithoutOverrideTest extends Dog1 {

	public static void main(String[] args) {
		Animal1 animal = new MultiLevelInheritanceWithPolymorphismWithoutOverrideTest();
		animal.eat();
	}
}
