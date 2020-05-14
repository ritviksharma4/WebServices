package com.servlet.model;

public class UpdEmployee {
	private int EmpId;
	private String Name;
	private int Age;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	
	@Override
	public String toString() {
		return "Employee's Age Updated! ";
	}

}
