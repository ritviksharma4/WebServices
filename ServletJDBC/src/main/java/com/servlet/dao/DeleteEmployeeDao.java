package com.servlet.dao;

import java.sql.*;
import com.servlet.model.DelEmployee;

public class DeleteEmployeeDao {
	
	public DelEmployee delEmployee(int EmpId, String Name) {
		DelEmployee e1 = new DelEmployee();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","ritz","ritz");
			PreparedStatement ps = con.prepareStatement("DELETE FROM Employee WHERE EmpId = '"+EmpId+"' AND Name like '"+Name+"' ");
			
			ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e); 
		}
		
		return e1;
	}
	
}
