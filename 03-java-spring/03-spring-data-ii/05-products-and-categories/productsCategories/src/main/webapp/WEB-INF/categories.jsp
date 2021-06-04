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
<title>New Category</title>
</head>
<body>
	<div class="category">
	
		<h1>Welcome to our Category page.</h1>
		
		<h3>Please create your Category below.</h3>
		
		<a href="/">Home</a> | <a href="/new/product">Add new product</a>
		
		<form:form method="POST" action="/add/category" modelAttribute="categories">
		
	<div class="form-group row">
	
		<form:label path="name">Category Name:
		
		<form:input class="form-control" path="name" value="${category.name}"/></form:label>
		
	</div>
		
		<button type="submit" class="btn btn-outline-secondary">Create Category</button>
		
		</form:form>
		
	</div>
</body>
</html>