<%@page import="com.servlet.model.InsEmployee"%>
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
	
		InsEmployee e1 = (InsEmployee)request.getAttribute("InsEmployee");
	
		out.println(e1);
	
	%>

</body>
</html>