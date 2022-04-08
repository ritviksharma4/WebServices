<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>
 	 	
 	<form action = 'getUpdEmployee'>
 	
	 	<h1>Enter Employee Details to be Updated...</h1>	
		
		Enter Employee Id : <input type = "text" name = "EmpId"><br><br>
	
		Enter Employee Name : <input type = "text" name = "Name"><br><br>
	
		Enter Employee Salary : <input type = "text" name = "Salary"><br><br>
		
		Enter Employee Department Id : <input type = "text" name = "DeptId"><br><br>
 	
 		<input type = "Submit">
 		
 	</form>
 	<TABLE>
			<TR>
			<TD><FORM ACTION="index.jsp" method="get" >
			<button type="submit"><-- Back</button></TD>
			</TR>
	</TABLE>
</body>
</html>