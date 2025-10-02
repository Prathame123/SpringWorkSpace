package com.dp.SimpleFactory.Test;

import com.dp.SimpleFactory.factory.VehicleFactory;
import com.dp.SimpleFactory.model.IVehicle;

public class SimpleFactoryDpTest {
	public static void main(String[] args) {
		IVehicle vehicle = VehicleFactory.GetVehicle("truck");
		vehicle.drive();
	}
}
