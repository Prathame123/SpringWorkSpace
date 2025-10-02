package com.dp.abstractfactory.Factory;

import com.dp.abstractfactory.Model.IChair;
import com.dp.abstractfactory.Model.ISopa;

public interface IFurnitureFactory {
	IChair CreateChair();
	ISopa CreateSopa();
}