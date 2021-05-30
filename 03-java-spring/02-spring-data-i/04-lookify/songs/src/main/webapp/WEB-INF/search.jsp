<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Artist Search</title>
</head>
<body>
	<div id="search">
		<a href="/dashboard">Dashboard</a>
		<p>Songs by Artist: <c:out value="${artist}"/></p>
	</div>
		<form method = "POST" action="/search">
	<div class="input-group mb-2 mr-sm-2">
		<input class="form-control" type="text" placeholder="Search Artist" name="artist">
		<button class="btn btn-outline-danger mb-2">Search Artist</button>
	</div>
		</form>
	<table class="table table-success">
   		<thead>
       		<tr>
            	<th>Title</th>
            	<th>Rating</th>
            	<th>Action</th>
        	</tr>
    	</thead>
    <tbody>
        <c:forEach items="${oneArtist}" var="song">
		<tr>    
    		<td><a href="/song/${song.id}"><c:out value="${song.title}"/></a></td>
    		<td><c:out value="${song.rating}"/></td>
    		<td><a href="/song/delete/${song.id}">delete</a>
		</tr>
		</c:forEach>
    </tbody>
	</table>
</body>
</html>