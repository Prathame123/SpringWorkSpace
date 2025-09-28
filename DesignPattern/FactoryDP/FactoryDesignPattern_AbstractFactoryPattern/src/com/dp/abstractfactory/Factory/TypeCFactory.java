package com.dp.abstractfactory.Factory;

import com.dp.abstractfactory.Model.IChair;
import com.dp.abstractfactory.Model.ISopa;
import com.dp.abstractfactory.Model.TypeCChair;
import com.dp.abstractfactory.Model.TypeCSopa;

public class TypeCFactory implements IFurnitureFactory {

	@Override
	public IChair CreateChair() {
		System.out.println("TypeCFactory.CreateChair()");
		return new TypeCChair();
	}

	@Override
	public ISopa CreateSopa() {
		System.out.println("TypeCFactory.CreateSopa()");
		return new TypeCSopa();
	}
}