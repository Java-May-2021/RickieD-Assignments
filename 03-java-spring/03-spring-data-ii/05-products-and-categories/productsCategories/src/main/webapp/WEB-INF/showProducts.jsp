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
<title>Show Product: ${product.name}</title>
</head>
<body>
	<div class="showProduct">
	
		<h3>Product: <c:out value="${product.name}"/></h3>
		
		<h5>Description:  ${ product.description }</h5>
		
		<h5>Price:
		
		<c:set var = "price" value = "${ product.price }" />
		
			<fmt:setLocale value="en_US"/>
			
			<fmt:formatNumber value="${product.price}" type="currency"/>
		</h5>
		
		<hr><hr>
		
		<h3>Category:</h3>
		
			<ul type = "circle">
			
				<c:forEach items="${ product.categories }" var="cat">
				
					<li>${ cat.name }</li>		
						
				</c:forEach>
				
			</ul>
		
		<form action="/product/${product.id}" method="POST">
		
			<label>Select category for the product: ${product.name}: </label> 
			
			<select name="category">
			
				<c:forEach items="${categoryNotInProduct}" var="cat">
				
			        	<option value="${cat.id}">${cat.name}</option>
			        	
			    </c:forEach> 
			    
			</select> 
			
			<button class="btn btn-outline-secondary btn-sm">Add</button>
			
		</form><br>
		
		<a href="/">Home</a><span>|</span><a href="/new/product">Add new product</a><span>|</span><a href="/new/category">Add new category</a>
		
	</div>
</body>
</html>