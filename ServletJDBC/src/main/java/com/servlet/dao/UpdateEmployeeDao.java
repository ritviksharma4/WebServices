package com.servlet.dao;

import java.sql.*;
import com.servlet.model.UpdEmployee;

public class UpdateEmployeeDao {
	
	public UpdEmployee getUpdEmployee(int EmpId, String Name, int Age) {
		UpdEmployee e1 = new UpdEmployee();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","ritz","ritz");
			PreparedStatement ps = con.prepareStatement("UPDATE Employee set Age = '"+Age+"' where Name like '"+Name+"'");
			
			ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e); 
		}
		
		return e1;
	}
	
}
