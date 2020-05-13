<%@page import="com.servlet.model.InsertEmployee"%>
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
	
		InsertEmployee i1 = (InsertEmployee)request.getAttribute("InsertEmployee");
	
		out.println(i1);
	
	%>

</body>
</html>