package com.dp.SimpleFactory.model;

public class Car implements IVehicle {

	@Override
	public void drive() {
		System.out.println("Car.drive()");
	}
}