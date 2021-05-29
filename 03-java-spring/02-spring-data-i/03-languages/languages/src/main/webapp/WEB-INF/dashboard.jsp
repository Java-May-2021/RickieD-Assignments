<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Languages</title>
</head>
<body>
	<h1>Languages</h1>
	
	<table class="table table-secondary">
   		<thead>
       		<tr>
            	<th>Name</th>
            	<th>Creator</th>
            	<th>Version</th>
            	<th>Action</th>
        	</tr>
    	</thead>
    <tbody>
        <c:forEach items="${allLanguages}" var="lang">
		<tr>    
    		<td><a href="/languages/view/${lang.id}"><c:out value="${lang.name}"/></a></td>
    		<td><c:out value="${lang.creator}"/></td>
    		<td><c:out value="${lang.version}"/></td>
    		<td><a href="languages/destroy/${lang.id}">delete</a> <span>|</span> <a href="languages/edit/${lang.id}">edit</a></td>
		</tr>
		</c:forEach>
    </tbody>
	</table>

	<hr style="border: 5px solid #0084ad"><br>
	
	<div class="add">
	
		<h1>Add Language</h1><br>
	
		<form:form method="POST" action="/languages" modelAttribute="language" >
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
			<div class="form-group row">
				<form:label path="name">Name:
				<form:errors path="name"/>
				<form:input class="form-control" path="name" id="name"/></form:label>
			</div>
			<div class="form-group row">
				<form:label path="creator">Creator:
				<form:errors path="creator"/>
				<form:input class="form-control" path="creator"/></form:label>
			</div>
			<div class="form-group row">
				<form:label path="version">Version:
				<form:errors path="version"/>
				<form:input class="form-control" path="version"/></form:label>
			</div>
				<button class="btn btn-secondary">Submit</button>
		</form:form><br>
	</div>
</body>
</html>