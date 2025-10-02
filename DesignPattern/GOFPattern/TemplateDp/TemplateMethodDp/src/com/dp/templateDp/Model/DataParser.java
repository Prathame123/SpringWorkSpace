package com.dp.templateDp.Model;

public abstract class DataParser {
	public void ParseData()
	{
		OpenFile();
		ReadData();
		ProcessData();
		closeFile();
	}
	
	protected void OpenFile()
	{
		System.out.println("DataParser.OpenFile()");
	}
	
	protected void closeFile()
	{
		System.out.println("DataParser.closeFile()");
	}
	
	protected abstract void ReadData();
	protected abstract void ProcessData();
}