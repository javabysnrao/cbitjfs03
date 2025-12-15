package com.cbit.springcore_app1;

public class Address {

	private String doorNo;
	private String city;
	private String state;
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void displayAddress() {
		System.out.println(doorNo+"  "+city+"  "+state);
	}
	
}
