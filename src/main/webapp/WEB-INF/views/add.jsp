<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

<title>Add new person</title>
</head>
<body>

<form id="form1" name="form1" method="post" action="">
<fieldset class="boxBody">
<table border="0" cellspacing="0" cellpadding="0" class="ListMain">
  <tr>
    <th colspan="2" scope="col">Add a New Person</th>
  </tr>
  <tr>
    <td align="right">First Name:</td>
    <td><input class="ListInput" name="textfield" type="text" id="textfield" size="20" maxlength="50" /></td>
  </tr>
  <tr>
    <td align="right">Last Name:</td>
    <td><input class="ListInput" name="textfield" type="text" id="textfield" size="20" maxlength="50" /></td>
  </tr>
  <tr>
    <td colspan="2" align="center">
    
    <div class="ListButtons"><a href="#">Submit</a></div>
      
    
    </td>
  </tr>
</table>
</fieldset>
</form>


</body>
</html>