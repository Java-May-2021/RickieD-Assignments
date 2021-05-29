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
<title>Show ${language.name}</title>
</head>
<body>
	<div class="dash">
	<a href="/languages">Dashboard</a>
	</div>
	<br>
	<div id="show">
	
	<p><c:out value="${language.name}" /></p>
	
	<p><c:out value="${language.creator}" /></p>
	
	<p><c:out value="${language.version}" /></p>
	
	<a href="/languages/${language.id}/edit">Edit</a><br>
	<a href="/languages/destroy/${language.id}">Delete</a>
	</div>
</body>
</html>