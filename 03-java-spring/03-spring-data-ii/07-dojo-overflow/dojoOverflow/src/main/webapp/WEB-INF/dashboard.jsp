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
<title>Dashboard</title>
</head>
<body>
	<div class="show">
	
	<h1>Questions Dashboard</h1>
	
	<div class="btn-group">
  <a href="/new/question" type="button" class="btn btn-outline-danger">Create New Question</a>
  
</div>
	
	<table class="table table-warning">
	
   		<thead>
   		
       		<tr>
       		
            	<th>Questions</th>
            	
            	<th>Tags</th>
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${allQuestions}" var="quest">
    
			<tr>
		    
    			<td><a href="question/${quest.id}"><c:out value="${quest.question}"/></a></td>
    			<c:forEach items="${allTags}" var="tags">
    			<td><c:out value="${quest.tags}"/></td>
    			</c:forEach>
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
	
	</div>
	
</body>
</html>