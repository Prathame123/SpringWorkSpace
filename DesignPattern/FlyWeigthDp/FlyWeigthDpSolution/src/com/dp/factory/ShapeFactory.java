package com.dp.factory;

import java.util.*;

import com.dp.flywdp.Shape;
import com.dp.flywdp.Square;

public class ShapeFactory {
	private static Map<String, Shape> shapeCache = new HashMap<String, Shape>();
	
	public static Shape getShape(String shapeType)
	{
		if(!shapeCache.containsKey(shapeType))
		{
			if(shapeType.equals("square"))
			{
				Shape shape = new Square(shapeType);
				shapeCache.put(shapeType, shape);
			}
			else if(shapeType.equals("circle"))
			{
				Shape shape = new Square(shapeType);
				shapeCache.put(shapeType, shape);
			}
		}
		
		return shapeCache.get(shapeType);
	}
}
