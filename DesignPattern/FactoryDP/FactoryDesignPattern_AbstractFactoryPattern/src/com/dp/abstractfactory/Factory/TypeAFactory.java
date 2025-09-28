package com.dp.abstractfactory.Factory;

import com.dp.abstractfactory.Model.IChair;
import com.dp.abstractfactory.Model.ISopa;
import com.dp.abstractfactory.Model.TypeAChair;
import com.dp.abstractfactory.Model.TypeASopa;

public class TypeAFactory implements IFurnitureFactory {

	@Override
	public IChair CreateChair() {
		System.out.println("TypeAFactory.CreateChair()");
		return new TypeAChair();
	}

	@Override
	public ISopa CreateSopa() {
		System.out.println("TypeAFactory.CreateSopa()");
		return new TypeASopa();
	}
}
