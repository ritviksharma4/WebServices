package com.servlet.dao;

import java.sql.*;
import com.servlet.model.InsertEmployee;

public class InsertEmployeeDao {
	
	public InsertEmployee getInsertEmployee(int EmpId, String Name, int Age) {
		InsertEmployee i = new InsertEmployee();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","ritz","ritz");
			PreparedStatement ps = con.prepareStatement("INSERT INTO InsertEmployee (EmpId, Name, Age) VALUES ('"+EmpId+"' , '"+Name+"' , '"+Age+"' )");
			
			ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e); 
		}
		
		return i;
	}
	
}
