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
<title>Welcome!</title>
</head>
<body>
	<div class="index">

		<h1>Welcome to Products and Categories</h1>
		
		<a href="/new/product">Add new product</a> | <a href="/new/category">Add new category</a>
		<hr><hr>

		<div class="text">
			<h5>List of Products: </h5> 
			<ul type = "square">
				<c:forEach items="${products}" var="product">
					<li><a href="show/product/${product.id}">${product.name}</a></li>
				</c:forEach>
			</ul>
			
		</div>
		<div class="text">
			<h5>Product Categories:</h5> 
			<ul type = "square">
				<c:forEach items="${categories}" var="category">
					<li><a href="show/category/${category.id}">${category.name}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>