package com.servlet.dao;

import java.sql.*;
import com.servlet.model.InsEmployee;

public class InsertEmployeeDao {
	
	public InsEmployee getInsEmployee(int EmpId, String Name, int Salary, int DeptId) {
		InsEmployee e1 = new InsEmployee();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagement","root","Kind@1212");
			PreparedStatement ps = con.prepareStatement("INSERT INTO employee_management (EmpId, Name, Salary, DeptId) VALUES ('"+EmpId+"' , '"+Name+"' , '"+Salary+"', '"+DeptId+"' )");
			
			ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e); 
		}
		
		return e1;
	}
	
}
