package com.dp.factory;

import com.dp.Buider.ConcreateHouseBuilder;
import com.dp.Buider.HouseBuilder;
import com.dp.Buider.IglooHouseBuilder;
import com.dp.Buider.WoodenHouseBuilder;
import com.dp.director.CivilEngineer;
import com.dp.model.House;

public class HouseFactory {
	public static House buildHouse(String type)
	{
		HouseBuilder houseBuilder = null;
		switch(type.toLowerCase())
		{
			case "concrete":
			{
				houseBuilder = new ConcreateHouseBuilder();
				break;
			}
			case "wooden":
			{
				houseBuilder = new WoodenHouseBuilder();
				break;
			}
			case "igloo":
			{
				houseBuilder = new IglooHouseBuilder();
				break;
			}
		}
		
		CivilEngineer engineer = new CivilEngineer(houseBuilder);
		return engineer.constructHouse();
	}
}