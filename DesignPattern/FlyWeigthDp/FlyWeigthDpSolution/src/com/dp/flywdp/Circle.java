package com.dp.flywdp;

public class Circle implements Shape {
	private String label;
	
	public Circle(String label) {
		this.label = "Circle";
	}

	@Override
	public void draw(int arg, String fillColor, String style) {
		System.out.println("Drawing "+label+" having side"+arg+"with fill color"+"and line style"+style);
	}

}
