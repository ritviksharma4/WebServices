package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int menu = Integer.parseInt(req.getParameter("menu"));
		
		if( menu == 1 ) {
			RequestDispatcher rd = req.getRequestDispatcher("Insert.jsp");
			rd.forward(req, res); 
		}
		
		else if ( menu == 2 ) {
			RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
			rd.forward(req, res); 
		}
		
		else if ( menu == 3 ) {
			RequestDispatcher rd = req.getRequestDispatcher("Delete.jsp");
			rd.forward(req, res); 
		}
		else if ( menu == 4 ) {
			RequestDispatcher rd = req.getRequestDispatcher("FetchDetails.jsp");
			rd.forward(req, res); 
		}
		
	}

}
