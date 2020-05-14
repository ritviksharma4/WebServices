package com.servlet.dao;

import java.sql.*;
import com.servlet.model.InsEmployee;

public class InsertEmployeeDao {
	
	public InsEmployee getInsEmployee(int EmpId, String Name, int Age) {
		InsEmployee e1 = new InsEmployee();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","ritz","ritz");
			PreparedStatement ps = con.prepareStatement("INSERT INTO Employee (EmpId, Name, Age) VALUES ('"+EmpId+"' , '"+Name+"' , '"+Age+"' )");
			
			ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e); 
		}
		
		return e1;
	}
	
}
