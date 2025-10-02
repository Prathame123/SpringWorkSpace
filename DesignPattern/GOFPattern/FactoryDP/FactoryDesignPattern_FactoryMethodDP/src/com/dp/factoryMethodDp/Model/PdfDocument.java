package com.dp.factoryMethodDp.Model;

public class PdfDocument implements IDocument {

	@Override
	public void Open() {
		System.out.println("PdfDocument.Open()");
	}
}