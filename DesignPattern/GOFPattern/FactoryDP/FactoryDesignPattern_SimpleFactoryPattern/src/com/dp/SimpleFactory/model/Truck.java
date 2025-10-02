package com.dp.SimpleFactory.model;

public class Truck implements IVehicle {

	@Override
	public void drive() {
		System.out.println("Truck.drive()");
	}

}