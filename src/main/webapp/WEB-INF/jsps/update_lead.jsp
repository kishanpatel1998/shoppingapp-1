<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
</head>
<body>
<h2>update lead</h2>
<form action="updateLead" method="post">
<table>
<tr>
<td><input type="hidden" name="id" value="${lead.id}"/></td>
</tr>
<tr>
<td>First Name</td>
<td><input type="text" name="firstName" value="${lead.firstName}"/></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" value="${lead.lastName}"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" value="${lead.email}" /></td>
</tr>
<tr>
<td>mobile</td>
<td><input type="text" name="mobile" value="${lead.mobile}"/></td>
</tr>
<tr>
<td>
<input type="submit" value="update"/>
</td>
</tr>
</table>



</form>
${msg}
</body>
</html>