package com.dp.factoryMethodDp.Factory;

import com.dp.factoryMethodDp.Model.ExcelDocument;
import com.dp.factoryMethodDp.Model.IDocument;

public class ExcelDocumentCreator extends DocumentCreator {

	@Override
	public IDocument CreateDocument() {
		System.out.println("ExcelDocumentCreator.CreateDocument()");
		return new ExcelDocument();
	}
}