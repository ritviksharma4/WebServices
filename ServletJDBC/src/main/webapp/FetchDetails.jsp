<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
 	
	<h2>Employee Details along with Department Name</h2>	
	
	<% 
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/EmployeeManagement";
			Connection connection = null;
			Statement statement = null;
			ResultSet rs = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(connectionURL, "root", "Kind@1212");
			statement = connection.createStatement();
			String QueryString = "SELECT emp.EmpId, emp.Name \"EmpName\", emp.Salary, emp.DeptId, dept.Name \"DeptName\" from employee_management emp inner join employee_dept dept on emp.DeptId = dept.DeptId;";
			rs = statement.executeQuery(QueryString);
			%>
			
			<Table cellpadding = "15" border = "1" style = "background-color: #ffffcc;">
			<TR>
				<Th>EmpId</Th>
				<Th>EmpName</Th>
				<Th>Salary</Th>
				<Th>DeptId</Th>
				<Th>DeptName</Th>
			</TR>
				<% 
					while (rs.next()) {
				%>	
				<TR>
					<TD><%= rs.getInt(1)%></TD>
					<TD><%= rs.getString(2)%></TD>
					<TD><%= rs.getInt(3)%></TD>
					<TD><%= rs.getInt(4)%></TD>
					<TD><%= rs.getString(5)%></TD>
				</TR>
				<% } %>		
				<%
			rs.close();
			statement.close();
			connection.close();	
			} catch (Exception ex) {
				%>
				</font>
				<font size="+3" color="red"></b>
				<%
				out.println("Unable to connect to database.");
				}
	
		%>
			</font>
			</Table>
			<TABLE>
			<TR>
			<TD><FORM ACTION="index.jsp" method="get" >
			<button type="submit"><-- Back</button></TD>
			</TR>
			</TABLE>
</body>
</html>