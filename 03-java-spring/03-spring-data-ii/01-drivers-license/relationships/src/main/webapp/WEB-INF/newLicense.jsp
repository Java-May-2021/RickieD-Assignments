<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>New License</title>
</head>
<body>
	<div class="license"><br>
	
		<h1>Create License</h1>
		
		<h4>To generate a license number, select your name and enter the expiration date followed by licensing state or cancel to exit the system.</h4>
		
		<hr><hr>
				
		<c:forEach items="${errors}" var="err">
		
		<h4>${err}</h4>
		
		</c:forEach>
		
		<form:form method="POST" action="/license/create" modelAttribute="license">
		
	<div class="form-group">
	
		<form:label path="person">Customer:</form:label>
		
		<form:select type="select" path="person">
		
		<c:forEach items="${allPersons}" var="person">
		
		<form:option value="${person.id}">${person.firstName} ${person.lastName}</form:option>
		
		</c:forEach>
		
		</form:select>
		
		<form:errors path="person"></form:errors>
		
	</div>
	
	<div class="form-group">
	
		<form:label path="state">State:</form:label>
		
		<form:input type="text" path="state"/>
		
		<form:errors path="state"></form:errors>
		
	</div>
	
	<div class="form-group">
	
		<form:label path="expirationDate">Expiration Date:</form:label>
		
		<form:input pattern = "MM/dd/yyyy" type="date" path="expirationDate"/>
		
		<form:errors path="expirationDate"></form:errors>
		
	</div>
		<button type="submit" class="btn btn-outline-success" value="View License Details"/>View License Details</button>
				
		<a href="/" class="btn btn-outline-danger">Cancel</a>
		
		</form:form>
		
	</div>
</body>
</html>