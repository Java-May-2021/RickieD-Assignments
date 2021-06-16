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
<title>Queries</title>
</head>
<body>
	<h3>Countries that speak Slovene</h3>
		<table class="table table-sm table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Country Name</th>
            	<th>Language</th>
            	<th>Percentage</th>
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${sloveneCountries}" var="row">
    
			<tr>
		    	<td><c:out value="${row[0].name}"/></td>
    			<td><c:out value="${row[1].language}"/></td>
    			<td><c:out value="${row[1].percentage}"/></td>
   
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
		<h3>Total number of cities per country</h3>
			<table class="table table-sm table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Name</th>
            	<th>Count</th>
          
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${cityCountByCountry}" var="row">
    
			<tr>
		    	<td><c:out value="${row[0].name}"/></td>
    			<td><c:out value="${row[1]}"/></td>
   
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
		
		<h3>Cities in Mexico with population greater than 500,000</h3>
		<table class="table table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Name</th>
            	<th>Population</th>
          
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${mexicanCities}" var="row">
    
			<tr>
		    	<td><c:out value="${row.name}"/></td>
    			<td><c:out value="${row.population}"/></td>
   
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
		
		<h3>Languages in each country with percentage greater than 89%</h3>
		<table class="table table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Name</th>
            	<th>Language</th>
            	<th>Percentage</th>
          
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${languagesByCountry}" var="row">
    
			<tr>
		    	<td><c:out value="${row[0].name}"/></td>
    			<td><c:out value="${row[1].language}"/></td>
   				<td><c:out value="${row[1].percentage}"/></td>
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
		
		<h3>Countries with surface area below 501 and population greater than 100,000</h3>
		<table class="table table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Name</th>
            	<th>Surface Area</th>
            	<th>Population</th>
          
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${smallCountries}" var="row">
    
			<tr>
		    	<td><c:out value="${row.name}"/></td>
    			<td><c:out value="${row.surface_area}"/></td>
   				<td><c:out value="${row.population}"/></td>
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
		
		<h3>Countries with a Constitutional Monarchy, GNP greater than 200, and life expectancy greater than 75 years</h3>
		<table class="table table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Name</th>
            	<th>GNP</th>
            	<th>Life Expectancy</th>
          
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${constMonarchyCountries}" var="row">
    
			<tr>
		    	<td><c:out value="${row.name}"/></td>
    			<td><c:out value="${row.gnp}"/></td>
   				<td><c:out value="${row.life_expectancy}"/></td>
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
		
		<h3>Argentinian cities in the Buenos Aires district with population greater than 500,000</h3>
		<table class="table table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Country Name</th>
            	<th>City Name</th>
            	<th>District</th>
            	<th>Population</th>
          
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${buenosAiresCities}" var="row">
    
			<tr>
		    	<td><c:out value="${row.country.name}"/></td>
    			<td><c:out value="${row.name}"/></td>
   				<td><c:out value="${row.district}"/></td>
   				<td><c:out value="${row.population}"/></td>
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
		
		<h3>Number of countries in each region</h3>
		<table class="table table-warning">
	
   		<thead>
   		
       		<tr>
       		
       			<th>Region</th>
            	<th>Num of Countries</th>
          
            	
        	</tr>
        	
    	</thead>
    	
    	
    	<tbody>
    
    			<c:forEach items="${countriesByRegion}" var="row">
    
			<tr>
		    	<td><c:out value="${row[0].region}"/></td>
    			<td><c:out value="${row[1]}"/></td>
			</tr>
			
				</c:forEach>
				
    	</tbody>
    
    
		</table>
</body>
</html>