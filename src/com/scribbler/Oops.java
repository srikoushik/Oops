package com.scribbler;

import com.scribbler.Car.BrakeTypes;

public class Oops {

	public static void main(String args[]) {
		Car car = new Car("Suzuki", "Swift");
		car.move();
		car.brake(BrakeTypes.HAND_BRAKE);
		car.stop();
		
		ElectricCar electricCar = new ElectricCar("Tesla", "ModelX");
		electricCar.move();
		electricCar.stop();
	}
}
