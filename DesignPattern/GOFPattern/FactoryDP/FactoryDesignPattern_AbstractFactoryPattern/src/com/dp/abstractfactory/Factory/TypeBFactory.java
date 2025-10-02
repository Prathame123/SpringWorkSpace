package com.dp.abstractfactory.Factory;

import com.dp.abstractfactory.Model.IChair;
import com.dp.abstractfactory.Model.ISopa;
import com.dp.abstractfactory.Model.TypeBChair;
import com.dp.abstractfactory.Model.TypeBSopa;

public class TypeBFactory implements IFurnitureFactory {

	@Override
	public IChair CreateChair() {
		System.out.println("TypeBFactory.CreateChair()");
		return new TypeBChair();
	}

	@Override
	public ISopa CreateSopa() {
		System.out.println("TypeBFactory.CreateSopa()");
		return new TypeBSopa();
	}
}