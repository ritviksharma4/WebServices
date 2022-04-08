package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.InsertEmployeeDao;
import com.servlet.model.InsEmployee;

public class InsertEmployee extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int EmpId = Integer.parseInt(req.getParameter("EmpId"));
		String Name = req.getParameter("Name");
		int Salary = Integer.parseInt(req.getParameter("Salary"));
		int DeptId = Integer.parseInt(req.getParameter("DeptId"));
	
		InsertEmployeeDao dao = new InsertEmployeeDao();
		InsEmployee i1 = dao.getInsEmployee(EmpId, Name, Salary, DeptId);
	
		req.setAttribute("InsEmployee", i1);
	
		RequestDispatcher rd = req.getRequestDispatcher("showInsEmployee.jsp");
		rd.forward(req, res); 
	}
}
