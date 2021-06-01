<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>${person.firstName}'s Profile</title>
</head>
<body>

	<div class="view">

	<h1><c:out value="${person.firstName} ${person.lastName}" /></h1><br>
	
	<h3>License Number: 000000<c:out value="${person.id}"/></h3><br>
	
	<h3>State: <c:out value="${person.license.state}"/></h3><br>
	
	<h3>Expiration Date: <fmt:formatDate pattern = "MM/dd/yyyy" type="date" value="${person.license.expirationDate}"/></h3>
	
	<a href="/">Return</a>
	</div>
</body>
</html>