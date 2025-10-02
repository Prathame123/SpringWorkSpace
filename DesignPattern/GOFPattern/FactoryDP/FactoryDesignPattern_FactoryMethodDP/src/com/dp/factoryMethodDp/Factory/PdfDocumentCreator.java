package com.dp.factoryMethodDp.Factory;

import com.dp.factoryMethodDp.Model.IDocument;
import com.dp.factoryMethodDp.Model.PdfDocument;

public class PdfDocumentCreator extends DocumentCreator {

	@Override
	public IDocument CreateDocument() {
		System.out.println("PdfDocumentCreator.CreateDocument()");
		return new PdfDocument();
	}
}