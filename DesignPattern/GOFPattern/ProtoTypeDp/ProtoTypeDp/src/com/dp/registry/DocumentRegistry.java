package com.dp.registry;

import java.util.HashMap;
import java.util.Map;

import com.dp.prototype.Document;

public class DocumentRegistry {
	private Map<String,Document> registry = new HashMap<>();
	
	 public void registerDocument(String type, Document doc) {
	    registry.put(type, doc);
	 }
	 
	  public Document getDocument(String type) {
	        Document prototype = registry.get(type);
	        if (prototype == null) {
	            throw new RuntimeException("No prototype registered for type: " + type);
	        }
	        return prototype.clone(); // return a new copy
	    }
}