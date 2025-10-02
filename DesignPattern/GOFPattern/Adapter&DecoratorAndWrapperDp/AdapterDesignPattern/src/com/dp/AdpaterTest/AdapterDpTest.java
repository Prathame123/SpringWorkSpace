package com.dp.AdpaterTest;

import com.dp.adapter.ExternalWeatherApi;
import com.dp.adapter.WeatherAdpater;
import com.dp.target.WeatherService;

public class AdapterDpTest {
	public static void main(String[] args) {
		ExternalWeatherApi weatherApi = new ExternalWeatherApi();
		WeatherService weatherService = new WeatherAdpater(weatherApi);
		
		System.out.println("Delhi temp in C:" + weatherService.getTemperature("delhi"));
		System.out.println("Pune temp in C:" + weatherService.getTemperature("pune"));
	}
}
