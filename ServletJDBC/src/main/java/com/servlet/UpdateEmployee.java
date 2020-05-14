package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.UpdateEmployeeDao;
import com.servlet.model.UpdEmployee;

public class UpdateEmployee extends HttpServlet {
	static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int EmpId = Integer.parseInt(req.getParameter("EmpId"));
		String Name = req.getParameter("Name");
		int Age = Integer.parseInt(req.getParameter("Age"));
	
		UpdateEmployeeDao dao = new UpdateEmployeeDao();
		UpdEmployee i1 = dao.getUpdEmployee(EmpId, Name, Age);
	
		req.setAttribute("UpdEmployee", i1);
	
		RequestDispatcher rd = req.getRequestDispatcher("showUpdEmployee.jsp");
		rd.forward(req, res); 
	}
}
