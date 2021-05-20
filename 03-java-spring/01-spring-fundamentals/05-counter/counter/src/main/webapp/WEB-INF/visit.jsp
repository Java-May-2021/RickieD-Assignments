<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
<div class="visit">
<fieldset>
<legend>Times Visited</legend> <!--finish css for new page-->
<p>You visited this site ${count} times.</p>
<a href="/">Return</a>
</fieldset>
</div>
<a href="/clear">Reset Count</a><a href="/recount">Next Page</a>
</body>
</html>