package com.servlet.dao;

import java.sql.*;
import com.servlet.model.UpdEmployee;

public class UpdateEmployeeDao {
	
	public UpdEmployee getUpdEmployee(int EmpId, String Name, int Salary, int DeptId) {
		UpdEmployee e1 = new UpdEmployee();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagement","root","Kind@1212");
			PreparedStatement ps = con.prepareStatement("UPDATE employee_management set Salary = '"+Salary+"', DeptId = '"+DeptId+"' where EmpId = '"+EmpId+"' and Name = '"+Name+"'");
			
			ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e); 
		}
		
		return e1;
	}
	
}
