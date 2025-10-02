package com.dp.factoryMethodDp.Model;

public class WordDocument implements IDocument {

	@Override
	public void Open() {
		System.out.println("WordDocument.Open()");
	}
}