package com.servlet.model;

public class DelEmployee {
	private String Name;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	@Override
	public String toString() {
		return "Employee Deleted! ";
	}

}
