package com.dp.test;

import com.dp.factory.ShapeFactory;
import com.dp.flywdp.Shape;

public class FlyWeigthDpTest {
	public static void main(String[] args) {
		final int size = 50;
		for(int i=0;i<size;i++)
		{
			Shape shpe = ShapeFactory.getShape("square");
			System.out.println("HashCode"+ shpe.hashCode());
			shpe.draw(i+1, "white"+i, "dashed"+i);
			System.out.println("-------------------------");
		}
		
		for(int i=0;i<size;i++)
		{
			Shape shpe = ShapeFactory.getShape("circle");
			shpe.draw(i+1, "red"+i, "dotted"+i);
			System.out.println("-------------------------");
		}
	}
}
