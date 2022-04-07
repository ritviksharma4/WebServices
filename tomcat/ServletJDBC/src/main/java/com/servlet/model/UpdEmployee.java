package com.servlet.model;

public class UpdEmployee {
	private int EmpId;
	private String Name;
	private int Salary;
	
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
	public int getSalary() {
		return Salary;
	}
	public void setAge(int Salary) {
		this.Salary = Salary;
	}
	
	@Override
	public String toString() {
		return "Employee's Salary Updated! ";
	}

}
