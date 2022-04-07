<%@page import="com.servlet.model.DelEmployee"%>
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
	
		DelEmployee e1 = (DelEmployee)request.getAttribute("DelEmployee");
	
		out.println(e1);
	
	%>

</body>
</html>