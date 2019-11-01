<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello <%=request.getAttribute("name")%></title>
</head>
<body>
	<h1><%=request.getAttribute("name")%></h1>

	<%
		int i;
		String[] fruits = (String[]) request.getAttribute("fruits");
		for (i = 0; i < fruits.length; i++) {
			String fruit = fruits[i];
	%>
	<h1><%=fruit%></h1>
	<%
		}
	%>
</body>
</html>