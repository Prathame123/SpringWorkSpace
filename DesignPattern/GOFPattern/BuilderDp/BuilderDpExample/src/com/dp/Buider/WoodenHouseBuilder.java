package com.dp.Buider;

import com.dp.model.House;

public class WoodenHouseBuilder implements HouseBuilder { 

	private House house = new House();
	
	@Override
	public void buildFoundation() {
		house.setFoundation("wooden foundation");
		System.out.println("WoodenHouseBuilder.buildFoundation()");
	}	

	@Override
	public void buildStructure() {
		house.setStrcture("wooden strcture");
		System.out.println("WoodenHouseBuilder.buildStructure()");
	}

	@Override
	public void buildRoof() {
		house.setRoof("wooden roof");
		System.out.println("WoodenHouseBuilder.buildRoof()");
	}

	@Override
	public void buildGarage() {
		house.setHasGarage(false);
		System.out.println("WoodenHouseBuilder.buildGarage()");
	}

	@Override
	public void buildSwimmingPool() {
		house.setHasSwimmingPool(false);
		System.out.println("WoodenHouseBuilder.buildSwimmingPool()");
	}

	@Override
	public void buildGarden() {
		house.setHasGarden(true);
		System.out.println("WoodenHouseBuilder.buildGarden()");
	}

	@Override
	public House getHouse() {
		return house;
	}
}
