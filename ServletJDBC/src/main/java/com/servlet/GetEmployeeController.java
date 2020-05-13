package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.InsertEmployeeDao;
import com.servlet.model.InsertEmployee;

public class GetEmployeeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int EmpId = Integer.parseInt(req.getParameter("EmpId"));
		String Name = req.getParameter("Name");
		int Age = Integer.parseInt(req.getParameter("Age"));
		
		InsertEmployeeDao dao = new InsertEmployeeDao();
		InsertEmployee i1 = dao.getInsertEmployee(EmpId, Name, Age);
		
		req.setAttribute("InsertEmployee", i1);
		
		RequestDispatcher rd = req.getRequestDispatcher("showInsertEmployee.jsp");
		rd.forward(req, res); 
		
		
	}

}
