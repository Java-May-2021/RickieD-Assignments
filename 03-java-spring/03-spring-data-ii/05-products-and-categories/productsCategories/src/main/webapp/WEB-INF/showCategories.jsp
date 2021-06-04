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
<title>Show Category: ${category.name}</title>
</head>
<body>
	<div class="showCate">
	
		<h3>Category: <c:out value="${category.name}"/></h3>
		
		<c:set var = "price" value = "${ product.price }" />
		
		<hr><hr>
		
		<h3>Products:</h3>
		
			<ul type = "circle">
			
				<c:forEach items="${ category.products }" var="p">
				
					<li>${ p.name }</li>		
						
				</c:forEach>
				
			</ul>
		
		<form action="/category/${category.id}" method="POST">
		
			<label>Select product for the category: ${category.name}: </label> 
			
			<select name="product">
			
				<c:forEach items="${productNotInCategory}" var="pro">
				
			        	<option value="${pro.id}">${pro.name}</option>
			        	
			    </c:forEach> 
			    
			</select> 
			
			<button class="btn btn-outline-secondary btn-sm">Add</button>
			
		</form><br>
		
		<a href="/">Home</a><span>|</span><a href="/new/product">Add new product</a><span>|</span><a href="/new/category">Add new category</a>
		
	</div>
</body>
</html>