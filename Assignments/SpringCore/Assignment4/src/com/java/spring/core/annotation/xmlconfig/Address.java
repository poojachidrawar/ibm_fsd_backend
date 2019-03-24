package com.java.spring.core.annotation.xmlconfig;

import org.springframework.stereotype.Component;

@Component 
public class Address {
	
	String city;
	String country;
	int pin;
	
	public Address(String city, String country, int pin)
	{
		this.city = city;
		this.country = country;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
}
