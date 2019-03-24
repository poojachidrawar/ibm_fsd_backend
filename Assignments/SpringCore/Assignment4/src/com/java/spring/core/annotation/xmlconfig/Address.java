package com.java.spring.core.annotation.xmlconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Address {
	
	String city;
	String country;
	int pin;
	
//	public Address(String city, String country, int pin)
//	{
//		this.city = city;
//		this.country = country;
//		this.pin = pin;
//	}
	
    
	public String getCity() {
		return city;
	}
 
	@Value(value="bengaluru")
	public void setCity(String city) {
		this.city = city;
	}
    
	
	public String getCountry() {
		return country;
	}

	@Value(value="India")
	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	@Value(value="560045")
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
}
