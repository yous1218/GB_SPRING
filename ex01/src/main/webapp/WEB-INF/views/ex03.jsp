<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex03</title>
</head>
<body>
	<h1>Ex03</h1>
	<h2>
		ArrayList :
		<c:forEach var="data" items="${datas}">
		 	<c:out value="data(${data})"/>&nbsp;&nbsp;
		</c:forEach>
	</h2>
</body>
</html>