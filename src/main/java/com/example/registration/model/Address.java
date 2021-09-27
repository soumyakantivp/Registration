package com.example.registration.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private Integer pin;
	private String street;
	private String landmark;
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", street=" + street + ", landmark=" + landmark + "]";
	}
	
	
}
