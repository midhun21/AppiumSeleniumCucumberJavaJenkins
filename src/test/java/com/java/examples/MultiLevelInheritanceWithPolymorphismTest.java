package com.java.examples;

class Animal {
	public void eat() {
		System.out.println("Animal Eats.");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog Eats Dog.");
	}
}

class BabyDog extends Dog {
	@Override
	public void eat() {
		System.out.println("Baby Dog Drinks MILK.");
	}
}

public class MultiLevelInheritanceWithPolymorphismTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal dogAnimal = new Dog();
		Animal babyDogAnimal = new BabyDog();

		animal.eat(); // Calls Animal class eat() method
		dogAnimal.eat(); // Calls Dog class eat() method
		babyDogAnimal.eat(); // Calls BabyDog class eat() method
	}
}
