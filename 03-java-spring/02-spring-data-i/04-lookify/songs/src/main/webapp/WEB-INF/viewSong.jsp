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
<title>View ${song.title}</title>
</head>
<body>
	<div class="board">
	<a href="/dashboard">Dashboard</a>
	</div>
	
	<div class="view">
	
	<p>Title: <c:out value="${song.title}" /></p>
	
	<p>Artist: <c:out value="${song.artist}" /></p>
	
	<p>Rating: <c:out value="${song.rating}" /></p>
	
	<a href="/song/delete/${song.id}">Delete</a>
	
	</div>
</body>
</html>