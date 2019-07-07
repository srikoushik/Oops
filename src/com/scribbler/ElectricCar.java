package com.scribbler;

public class ElectricCar extends Car {

	public ElectricCar(String make, String model) {
		super(make, model);
	}
	
	public void move() {
		startWithBattery();
		System.out.println("Car is moving");
	}

	private void startWithBattery() {
		System.out.println("Battery turned on and accelerated.");
	}
}
