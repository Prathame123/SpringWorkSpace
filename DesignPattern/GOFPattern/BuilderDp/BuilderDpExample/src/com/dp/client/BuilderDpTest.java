package com.dp.client;

import com.dp.factory.HouseFactory;
import com.dp.model.House;

public class BuilderDpTest {
	public static void main(String[] args) {
		House house = HouseFactory.buildHouse("igloo");
		System.out.println("House"+ house);
	}
}