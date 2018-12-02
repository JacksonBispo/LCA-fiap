<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LCA ADVOCACIA</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<%@include file="menu.jsp"%>
	<h1>LCA ADVOCACIA</h1>
	<c:url value="processoServlet" var="link">
		<c:param name="ac" value="despesa"></c:param>	
		<c:param name="acao" value="listar"></c:param>	
	</c:url><a href="${link}">Despesas</a>
	<c:url value="processoServlet" var="link2">
		<c:param name="ac" value="honorario"></c:param>
		<c:param name="acao" value="listar"></c:param>		
	</c:url><a href="${link2}">Honorarios</a>
</body>
</html>