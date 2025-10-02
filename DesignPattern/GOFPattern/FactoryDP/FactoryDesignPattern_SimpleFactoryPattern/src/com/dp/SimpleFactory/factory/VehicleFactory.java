package com.dp.SimpleFactory.factory;

import com.dp.SimpleFactory.model.Bike;
import com.dp.SimpleFactory.model.Car;
import com.dp.SimpleFactory.model.IVehicle;
import com.dp.SimpleFactory.model.Truck;

public class VehicleFactory {
	public static IVehicle GetVehicle(String type)
	{
		switch(type.toLowerCase())
		{
			case "car" :
			{
				return new Car();
			}
			case "bike" :
			{
				return new Bike();
			}
			case "truck" :
			{
				return new Truck();
			}
		}
		
		return null;
	}
}