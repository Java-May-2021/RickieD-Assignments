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
<title>Add Song</title>
</head>
<body>
	<div class="add">
		
		<a href="/dashboard">Dashboard</a>
		
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
		
		<form:form method="POST" action="/create" modelAttribute="Song">
		
		<div class="form-group row">
			<form:label path="title">Title:
			<form:errors path="title"/>
			<form:input class="form-control" path="title" value="${song.title}"/></form:label>
		</div>
			
		<div class="form-group row">
			<form:label path="artist">Artist:
			<form:errors path="artist"/>
			<form:input class="form-control" path="artist" value="${song.artist}"/></form:label>
		</div>
			
		<div class="form-group row">
			<form:label path="rating">Rating(1-10):
			<form:errors path="rating"/>
			<form:select path="rating">
			<form:option value="1" />
			<form:option value="2" />
			<form:option value="3" />
			<form:option value="4" />
			<form:option value="5" />
			<form:option value="6" />
			<form:option value="7" />
			<form:option value="8" />
			<form:option value="9" />
			<form:option value="10" />
			</form:select></form:label>
		</div>
			
			<button class="btn btn-outline-success">Add Song</button>
		</form:form><br>
	</div>
</body>
</html>