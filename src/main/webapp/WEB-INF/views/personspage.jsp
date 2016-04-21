<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Team</title>

</head>
<body>
<h2>DevOps Team LV-178</h2>


<table class="tg">
	<tr>
		<th width="80">Person ID</th>
		<th width="120">First Name</th>
		<th width="120">Last Name</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listPersons}" var="person">
		<tr>
			<td>${person.id}</td>
			<td>${person.firstname}</td>
			<td>${person.lastname}</td>
			<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/delete/${person.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>


<div> 
<a href="<c:url value='/add' />" >Add</a> a person. 
</div>

</body>
</html>