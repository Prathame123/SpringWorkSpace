package com.dp.Buider;

import com.dp.model.House;


public class ConcreateHouseBuilder implements HouseBuilder {
	private House house = new House();
	
	@Override
	public void buildFoundation() {
		house.setFoundation("Concreate cement steel foundation");
		System.out.println("ConcreateHouseBuilder.buildFoundation()");
	}	

	@Override
	public void buildStructure() {
		house.setStrcture("Concreate cement steel strcture");
		System.out.println("ConcreateHouseBuilder.buildStructure()");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Concreate cement steel roof");
		System.out.println("ConcreateHouseBuilder.buildRoof()");
	}

	@Override
	public void buildGarage() {
		house.setHasGarage(true);
		System.out.println("ConcreateHouseBuilder.buildGarage()");
	}

	@Override
	public void buildSwimmingPool() {
		house.setHasSwimmingPool(false);
		System.out.println("ConcreateHouseBuilder.buildSwimmingPool()");

	}

	@Override
	public void buildGarden() {
		house.setHasGarden(true);
		System.out.println("ConcreateHouseBuilder.buildGarden()");
		
	}

	@Override
	public House getHouse() {
		return house;
	}

}
