package com.dp.flywdp;

public class Square implements Shape {

	private String label;
	
	public Square(String label) {
		this.label = "Square";
	}

	@Override
	public void draw(int arg, String fillColor, String style) {
		System.out.println("Drawing "+label+" having side"+arg+"with fill color"+"and line style"+style);
	}

}
