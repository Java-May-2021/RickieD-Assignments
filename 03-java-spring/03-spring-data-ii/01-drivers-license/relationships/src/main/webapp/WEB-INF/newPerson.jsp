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
<title>New Person</title>
</head>
<body>
	<div class="new">
	<h1>New Person</h1>
	<form:form method="POST" action="/persons/new" modelAttribute="person" >
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
			<div class="form-group row">
				<form:label path="firstName">First Name:
				<form:errors path="firstName"/>
				<form:input class="form-control" path="firstName"/></form:label>
			</div>
			<div class="form-group row">
				<form:label path="lastName">Last Name:
				<form:errors path="lastName"/>
				<form:input class="form-control" path="lastName"/></form:label>
			</div>
				<button class="btn btn-outline-success">Create</button>
		</form:form><br>
	</div>
</body>
</html>