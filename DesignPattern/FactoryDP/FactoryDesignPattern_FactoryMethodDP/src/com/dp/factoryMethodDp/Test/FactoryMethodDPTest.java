package com.dp.factoryMethodDp.Test;

import com.dp.factoryMethodDp.Factory.DocumentCreator;
import com.dp.factoryMethodDp.Factory.ExcelDocumentCreator;
import com.dp.factoryMethodDp.Factory.PdfDocumentCreator;
import com.dp.factoryMethodDp.Factory.WordDocumentCreator;
import com.dp.factoryMethodDp.Model.IDocument;

public class FactoryMethodDPTest {
	public static void main(String[] args) {
		DocumentCreator creator;
		String creatorType = "pdf";
		switch (creatorType.toLowerCase()) 
		{
			case "word": 
			{
				creator = new WordDocumentCreator();
				break;
			}
			case "pdf": 
			{
				creator = new PdfDocumentCreator();
				break;
			}
			case "excel": 
			{
				creator = new ExcelDocumentCreator();
				break;
			}
			default:	
			throw new IllegalArgumentException("Unexpected value: " + creatorType.toLowerCase());
		}
		
		IDocument document = creator.CreateDocument();
		document.Open();
	}
}