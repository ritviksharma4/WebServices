package com.servlet.model;

public class UpdEmployee {
	private int EmpId;
	private String Name;
	private int Salary;
	private int DeptId;
	
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
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int DeptId) {
		this.DeptId = DeptId;
	}
	
	@Override
	public String toString() {
		return "Employee's Salary and Department Id Updated! ";
	}

}
