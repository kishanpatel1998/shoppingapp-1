<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create  new lead</h2>
<form action="saveLead" method="post">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="firstName"/></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email"/></td>
</tr>
<tr>
<td>mobile</td>
<td><input type="text" name="mobile"/></td>
</tr>
<tr>
<td>
<input type="submit" value="save"/>
</td>
</tr>
</table>



</form>
${msg}
</body>
</html>