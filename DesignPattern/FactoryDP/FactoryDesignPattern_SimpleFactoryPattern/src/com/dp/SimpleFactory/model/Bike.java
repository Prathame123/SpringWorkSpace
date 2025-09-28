package com.dp.SimpleFactory.model;

public class Bike implements IVehicle {

	@Override
	public void drive() {
		System.out.println("Bike.drive()");
	}
}
