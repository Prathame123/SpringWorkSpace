package com.dp.factoryMethodDp.Factory;
import com.dp.factoryMethodDp.Model.IDocument;
import com.dp.factoryMethodDp.Model.WordDocument;

public class WordDocumentCreator extends DocumentCreator{

	@Override
	public IDocument CreateDocument() {
		System.out.println("WordDocumentCreator.CreateDocument()");
		return new WordDocument();
	}
}