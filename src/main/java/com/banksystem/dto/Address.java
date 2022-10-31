package com.banksystem.dto;

public class Address {
	
	public int streetNo;
	public String streetName, pincode, city, state, country;
	
	public Address(int streetNo, String streetName, String pincode, String city, String state, String country) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	} 

}
