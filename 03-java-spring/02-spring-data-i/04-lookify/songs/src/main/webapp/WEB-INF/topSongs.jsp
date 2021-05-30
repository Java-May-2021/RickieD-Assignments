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
<title>Top Ten</title>
</head>
<body>
	<div class="top">
	
	<a href="/dashboard">Dashboard</a>
	
	<h1>Top Ten Songs</h1>
	</div>
	<table class="table table-success">
	<thead>
       		<tr>
            	<th>Rating</th>
            	<th>Name</th>
            	<th>Artist</th>
        	</tr>
    	</thead>
    <tbody>
        <c:forEach items="${topTenSongs}" var="song">
		<tr>    
    		<td><c:out value="${song.rating}"/></a></td>
    		<td><a href="/song/${song.id}"><c:out value="${song.title}"/></a></td>
    		<td><c:out value="${song.artist}"/></td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>
</body>
</html>