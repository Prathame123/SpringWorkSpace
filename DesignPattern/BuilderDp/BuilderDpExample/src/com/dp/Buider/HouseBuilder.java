package com.dp.Buider;

import com.dp.model.House;

public interface HouseBuilder {
	
	void buildFoundation();
	void buildStructure();
	void buildRoof();
	void buildGarage();
	void buildSwimmingPool();
	void buildGarden();
	House getHouse();
}