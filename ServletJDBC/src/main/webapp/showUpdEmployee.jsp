<%@page import="com.servlet.model.UpdEmployee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Entry</title>
</head>
<body>
	
	<%
	
		UpdEmployee e1 = (UpdEmployee)request.getAttribute("UpdEmployee");
	
		out.println(e1);
	
	%>

</body>
</html>