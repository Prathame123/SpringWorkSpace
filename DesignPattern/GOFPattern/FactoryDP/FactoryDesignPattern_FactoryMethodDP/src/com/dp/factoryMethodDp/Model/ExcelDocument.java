package com.dp.factoryMethodDp.Model;

public class ExcelDocument implements IDocument {

	@Override
	public void Open() {
		System.out.println("ExcelDocument.Open()");
	}
}