package com.dp.adapter;

import com.dp.target.WeatherService;

public class WeatherAdpater implements WeatherService {
	private ExternalWeatherApi externalApi;

	public WeatherAdpater(ExternalWeatherApi externalApi) {
		this.externalApi = externalApi;
	}

	@Override
	public double getTemperature(String cityName) {
		String cityCode = getCityCode(cityName);
		double tempF = externalApi.getTemperatureF(cityCode);
		double tempC = (tempF -32)*5/9;
		return tempC;
	}	
	
	
	private String getCityCode(String cityName)
	{
		switch (cityName.toLowerCase()){
		case "mumbai": {
			return "MUM";
		}
		case "pune": {
			return "PN";
		}
		case "delhi": {
			return "DEL";
		}
		case "banglore": {
			return "BLG";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + cityName.toLowerCase());
		}
	}
	
	
	
}
