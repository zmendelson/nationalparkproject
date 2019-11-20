package com.techelevator.Models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Weather {
	
	private String parkCode;
	private Integer fiveDayForecastValue;
	private Integer low;
	private Integer high;
	private String forecast;
	
	public String getParkCode() {
		return parkCode;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public Integer getFiveDayForecastValue() {
		return fiveDayForecastValue;
	}
	public void setFiveDayForecastValue(Integer fiveDayForecastValue) {
		this.fiveDayForecastValue = fiveDayForecastValue;
	}
	public Integer getLow() {
		return low;
	}
	public void setLow(Integer low) {
		this.low = low;
	}
	public Integer getHigh() {
		return high;
	}
	public void setHigh(Integer high) {
		this.high = high;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	public int getCelsiusLowTemp() {

			Double tempInC = (low - 32) / 1.8;
			int convTemp = tempInC.intValue();
			return convTemp;	
	}
	public int getCelsiusHighTemp() {

		Double tempInC = (high - 32) / 1.8;
		int convTemp = tempInC.intValue();
		return convTemp;	
}
	
    public String getDayOfTheWeek() {
    	
    	LocalDate date = LocalDate.now();
    	
    	if(fiveDayForecastValue==1) {
    		return "Today";
    	} else if (fiveDayForecastValue==2) {
    		return "Tomorrow";
    	}else 
    	
    		date = date.plusDays(fiveDayForecastValue-1);
    		return date.getDayOfWeek().toString(); 
    }

}
