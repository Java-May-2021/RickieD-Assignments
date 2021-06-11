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
<title>${question.question} Profile</title>
</head>
<body>
	<div class="profile">
	
		<h1>${question.question}</h1>
		
		<a href="/questions">Dashboard</a>
		
		<h3>Tags: <span><c:out value="${question.tags}"/></span></h3>
		
	
		<table class="table table-warning">
		
   			<thead>
   			
       			<tr>
       			
            	<th>Answers</th>
            	
            	</tr>
            	
    		</thead>
    		
    		<c:forEach items="${question.answers}" var="ans">
    		
    		<tbody>
    		
				<tr>  
				  
    				<td><c:out value="${ans.answer}"/></td>
    		
				</tr>
				
    		</tbody>
    		
   			</c:forEach>
   			
		</table>
		
			
			<c:forEach items="${errors}" var="err">
			
			<h4>${err}</h4>
			
			</c:forEach>
		
			<form:form method="POST" action="/answers" modelAttribute="ans">
		
			<h2>Add your answer:</h2><br>
		
	<div class="form-group row">
			<form:hidden path="question" value="${question.id}"/> <!-- hidden input helps to satisfy null pointer error (points to object) -->
			
			<form:label path="answer">Answer:
			
			<form:errors path="answer"/>
			
			<form:textarea path="answer" class="form-control" type="text" rows="4" columns="100" value="${ans.answer}"/></form:label>
	</div>
			
			<button class="btn btn-outline-danger">Answer it!</button>
			
		</form:form><br>
	</div>
</body>
</html>