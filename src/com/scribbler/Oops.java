package com.scribbler;

public class Oops {

	public static void main(String args[]) {
		Car car = new Car("Suzuki", "Swift");
		car.move();
		car.stop();
		
		ElectricCar electricCar = new ElectricCar("Tesla", "ModelX");
		electricCar.move();
		electricCar.stop();
	}
}
