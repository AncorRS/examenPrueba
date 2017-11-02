<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="AntiqueWhite" allign="center">
	<p>
	<form action="MyServlet" method=Post>
	Enter login ID: <input type=Text name="id">
	
	<p>	
	Enter password: <input type=Password name="pwd">
	
	<p>
	<input type="Submit" value="login">
	<input type="Reset">
	</form>
	
	<form action= "jsp/registro.jsp" method=Post>
	Pagina de registro: <input type="Submit" value="login">
	</form>
	
	<form action= "www.google.com" method=Post>
	A google: <input type="Submit" value="login">
	</form>
	
	
	
</body>
</html>