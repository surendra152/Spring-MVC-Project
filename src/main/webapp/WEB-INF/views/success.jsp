<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>


	<h1>${student.name }</h1>
	<h1>${student.id }</h1>
	<h2>${student.address.city }</h2>
	<hr>
	<h2>${student }</h2>
</body>
</html>