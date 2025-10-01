package com.dp.Buider;

import com.dp.model.House;

public class IglooHouseBuilder implements HouseBuilder {

private House house = new House();
	
	@Override
	public void buildFoundation() {
		house.setFoundation("Igloo foundation");
		System.out.println("IglooHouseBuilder.buildFoundation()");
	}	

	@Override
	public void buildStructure() {
		house.setStrcture("Igloo strcture");
		System.out.println("IglooHouseBuilder.buildStructure()");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Igloo roof");
		System.out.println("IglooHouseBuilder.buildRoof()");
	}

	@Override
	public void buildGarage() {
		house.setHasGarage(false);
		System.out.println("IglooHouseBuilder.buildGarage()");
	}

	@Override
	public void buildSwimmingPool() {
		house.setHasSwimmingPool(false);
		System.out.println("IglooHouseBuilder.buildSwimmingPool()");
	}

	@Override
	public void buildGarden() {
		house.setHasGarden(true);
		System.out.println("IglooHouseBuilder.buildGarden()");
	}

	@Override
	public House getHouse() {
		return house;
	}
}
