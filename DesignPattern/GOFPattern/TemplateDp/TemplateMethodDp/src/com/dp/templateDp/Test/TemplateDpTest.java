package com.dp.templateDp.Test;

import com.dp.templateDp.Model.CsvParser;
import com.dp.templateDp.Model.DataParser;
import com.dp.templateDp.Model.ExcelParser;

public class TemplateDpTest {
	public static void main(String[] args) {
		DataParser dataParser;
		String parserType = "Csv";
		switch (parserType.toLowerCase())
		{
			case "csv": {
				dataParser = new CsvParser();
				break;
			}
			case "excel": {
				dataParser = new ExcelParser();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + parserType.toLowerCase());
		}
		
		dataParser.ParseData();
	}
}
