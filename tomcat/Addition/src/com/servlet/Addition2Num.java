package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Addition2Num extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int result = a + b;
		
		PrintWriter out = res.getWriter();
		out.println("Sum is " + result);
		
	}
}
