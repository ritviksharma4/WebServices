<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
</head>
<body>
 	 	
 	<form action = 'delEmployee'>
 	
	 	<h1>Enter details of the Employee who has to be Removed...</h1>	
	
		<br><br>Enter Employee Id : <input type = "text" name = "EmpId"><br><br>
		
		Enter Employee Name : <input type = "text" name = "Name"><br><br>
	
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