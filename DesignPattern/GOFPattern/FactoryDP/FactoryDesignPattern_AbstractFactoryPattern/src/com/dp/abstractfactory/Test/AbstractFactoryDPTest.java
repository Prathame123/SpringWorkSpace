package com.dp.abstractfactory.Test;

import com.dp.abstractfactory.Factory.IFurnitureFactory;
import com.dp.abstractfactory.Factory.TypeAFactory;
import com.dp.abstractfactory.Factory.TypeBFactory;
import com.dp.abstractfactory.Factory.TypeCFactory;
import com.dp.abstractfactory.Model.IChair;
import com.dp.abstractfactory.Model.ISopa;

public class AbstractFactoryDPTest {
	public static void main(String[] args) {
		String type = "TypeB";
		IFurnitureFactory factory;
		switch (type.toLowerCase()) {
		case "typea": 
		{
			factory = new TypeAFactory();
			break;
		}
		case "typeb": 
		{
			factory = new TypeBFactory();
			break;
		}
		case "typec": 
		{
			factory = new TypeCFactory();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type.toLowerCase());
		}
		
		IChair chair = factory.CreateChair();
		ISopa sopa = factory.CreateSopa();
		chair.SitOn();
		sopa.LieOn();
	}
}