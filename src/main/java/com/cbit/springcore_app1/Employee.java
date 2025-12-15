package com.cbit.springcore_app1;

import java.util.Date;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private List<String> nickNames;
	private Address address;
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayEmployee() {
		System.out.println(id + "  " + name + "  " + salary + "  " + nickNames);
		address.displayAddress();
	}
}
