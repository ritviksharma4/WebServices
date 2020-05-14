package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.DeleteEmployeeDao;
import com.servlet.model.DelEmployee;

public class DeleteEmployee extends HttpServlet {
	static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int EmpId = Integer.parseInt(req.getParameter("EmpId"));
		String Name = req.getParameter("Name");
		
		DeleteEmployeeDao dao = new DeleteEmployeeDao();
		DelEmployee i1 = dao.delEmployee(EmpId, Name);
	
		req.setAttribute("DelEmployee", i1);
	
		RequestDispatcher rd = req.getRequestDispatcher("showDelEmployee.jsp");
		rd.forward(req, res); 
	}
}
