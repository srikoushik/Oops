package com.scribbler;

public class Car extends WheeledVehicle{

	String carMake;
	String carModel;
	
	public Car(String make, String model) {
		this.wheels = 4;
		this.carMake = make;
		this.carModel = model;
	}
	
	@Override
	public void move() {
		ignition();
		acclerate();
		System.out.println("Car is moving.");
	}

	@Override
	public void stop() {
		brake();
		System.out.println("Car is stopped.");
	}

	private void acclerate() {
		System.out.println("Pressing the acclerator.");
	}

	private void ignition() {
		System.out.println("Starting the car by ignition.");
	}

	private void brake() {
		System.out.println("Applied brake.");
	}

	enum BrakeTypes {
		HAND_BRAKE, LEG_BRAKE
	}
	
	public void brake(BrakeTypes brake) {
		if(brake.equals(BrakeTypes.HAND_BRAKE)) {
			System.out.println("Hand brake applied.");
		} else {
			System.out.println("Leg brake applied.");
		}
		
	}
}
