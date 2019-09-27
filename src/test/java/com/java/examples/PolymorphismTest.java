package com.java.examples;

class Vehicle {
	int speed = 60;

	public void drive() {
		System.out.println("Driving Vehicle...");
	}
}

class Car extends Vehicle {
	int speed = 90;

	@Override
	public void drive() {
		System.out.println("Driving Car...");
	}

	public void typeOfCar() {
		System.out.println("Its a Petrol Car!!!!");
	}
}

class Truck extends Vehicle {
	int speed = 120;

	@Override
	public void drive() {
		System.out.println("Driving Truck...");
	}

	public void typeOfTruck() {
		System.out.println("Its a Diesel Car!!!!");
	}
}

public class PolymorphismTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(); // Vehicle reference to Vehicle object
		Vehicle carVehicle = new Car(); // Vehicle reference to Car object
		Car car = new Car(); // Car reference to Car object

		Vehicle truckVehicle = new Truck();
		Truck truck = new Truck();

		System.out.println("Speed of any Vehicle is: " + vehicle.speed); // Vehicle variable speed will be called
		System.out.println("Speed of carVehicle is: " + carVehicle.speed); // Car variable speed will be called
		System.out.println("Speed of car is: " + car.speed); // Car variable speed will be called
		System.out.println("Speed of truckVehicle is: " + truckVehicle.speed); // Truck variable speed will be called
		System.out.println("Speed of truck is: " + truck.speed); // Truck variable speed will be called

		vehicle.drive(); // Will call Vehicle's drive() method
		carVehicle.drive(); // Will call Car's drive() method
		car.drive(); // Will call Car's drive() method
		car.typeOfCar(); // Will call Car's typeOfCar() method
		truckVehicle.drive(); // Will call Truck's drive() method
		truck.drive(); // Will call Truck's drive() method
		truck.typeOfTruck(); // Will call Truck's typeOfTruck() method

		// Compile time error
		// carVehicle.typeOfCar();
		// truckVehicle.typeOfTruck();
	}
}
