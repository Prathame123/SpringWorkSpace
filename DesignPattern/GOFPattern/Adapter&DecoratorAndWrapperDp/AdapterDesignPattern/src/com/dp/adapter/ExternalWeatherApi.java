package com.dp.adapter;

public class ExternalWeatherApi {
	public double  getTemperatureF(String cityCode)
	{
		switch (cityCode) {
		case "DEL":
			return 95.0;
		case "MUM":
			return 95.0;
		case "PN":
			return 95.0;
		case "BLG":
			return 95.0;
		default:
			return 70.0;
		}
	}
}