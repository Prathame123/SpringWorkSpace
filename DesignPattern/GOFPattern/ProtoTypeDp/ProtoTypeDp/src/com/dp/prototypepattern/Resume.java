package com.dp.prototypepattern;

import com.dp.prototype.Document;

import dom.dp.concrete.Address;

public class Resume implements Document {
	private String name;
	    private String templateType;
	    private Address address;

	    public Resume(String templateType, Address address) {
	        this.templateType = templateType;
	        this.address = address;
	    }

	    public void setName(String name) { this.name = name; }
	    public void setAddress(Address address) { this.address = address; }

	    @Override
	    public Document clone() {
	        try {
	            // ----- SHALLOW COPY -----
	            // return (Document) super.clone();

	            // ----- DEEP COPY -----
	            Resume cloned = (Resume) super.clone();
	            cloned.address = address.clone(); // deep copy
	            return cloned;
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Clone not supported", e);
	        }
	    }

	    @Override
	    public void showInfo() {
	        System.out.println("Resume for: " + name +
	                " | Template: " + templateType +
	                " | Address: " + address);
	    }
}
