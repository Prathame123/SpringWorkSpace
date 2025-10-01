package com.dp.director;

import com.dp.Buider.HouseBuilder;
import com.dp.model.House;

public class CivilEngineer {
	
	private HouseBuilder houseBuilder;
	
	public CivilEngineer(HouseBuilder houseBuilder1) {
		houseBuilder = houseBuilder1;
	}
	
	public House constructHouse()
	{
		houseBuilder.buildFoundation();
		houseBuilder.buildStructure();
		houseBuilder.buildRoof();
		houseBuilder.buildSwimmingPool();
		houseBuilder.buildGarden();
		houseBuilder.buildGarage();
		return houseBuilder.getHouse();
	}
}