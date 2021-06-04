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
<title>New Products</title>
</head>
<body>
	<div class="add">
	
		<h1>Welcome to our Products page.</h1>
		<h3>Please fill in Product information below.</h3>
		
		<a href="/">Home</a> | <a href="/new/category">Add new category</a>
		
		<form:form method="POST" action="/add/product" modelAttribute="products">
		
		<div class="form-group row">
			<form:label path="name">Product Name:
			<form:errors path="name"/>
			<form:input class="form-control" path="name" value="${product.name}"/></form:label>
		</div>
			
		<div class="form-group row">
			<form:label path="description">Description:
			<form:errors path="description"/>
			<form:textarea class="form-control" path="description" value="${product.description}"/></form:label>
		</div>
			
		<div class="form-group row">
			<form:label path="price">Price:
			<form:errors path="price"/>
			<form:input class="form-control" path="price" value="${product.price}"/></form:label>
		</div>
			
			<button class="btn btn-outline-secondary">Add Product</button>
		</form:form><br>
		
	</div>
</body>
</html>