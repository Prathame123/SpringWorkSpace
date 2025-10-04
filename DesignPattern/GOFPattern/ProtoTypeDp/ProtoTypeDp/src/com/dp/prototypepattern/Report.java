package com.dp.prototypepattern;

import com.dp.prototype.Document;

public class Report implements Document {
	 private String author;
	 private String reportType;
	 public Report(String reportType) 
	 {
	    this.reportType = reportType;
	 }
	  
	    @Override
	    public Document clone() {
	        try {
	            return (Document) super.clone(); // shallow copy is enough
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Clone not supported", e);
	        }
	    }

	    @Override
	    public void showInfo() {
	        System.out.println("Report by: " + author + " | Type: " + reportType);
	    }
}