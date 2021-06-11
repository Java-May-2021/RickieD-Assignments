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
<title>New Question</title>
</head>
<body>
	<div class="add">
	
		<h1>Welcome to the Question page.</h1>
		<h3>Please fill in the information below.</h3>
		
		<a href="/questions">Dashboard</a><br>
		
		
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
		
		<form:form method="POST" action="/new/questions" modelAttribute="quest">
		
		<div class="form-group row">
			<form:label path="question">Question:
			<form:errors path="question"/>
			<form:textarea class="form-control" type="text" rows="3" path="question" value="${question.question}"/></form:label>
		</div>
			
		<div class="form-group row">
			<form:label path="tags">Tags:
			<form:errors path="tags"/>
			<form:input class="form-control" type="text" path="tags" value="${question.stTags}"/></form:label>
		</div>
			
			<button class="btn btn-outline-danger">Submit</button>
		</form:form><br>
		
	</div>
</body>
</html>