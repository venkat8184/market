<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create Lead</h2>
<hr>
<form action="saveLead" method="post">
<table>
<tr><td>FirstName:</td>
    <td><input type="text" name="firstName"></td>
</tr>
<tr><td>LastName:</td>
    <td><input type="text" name="lastName"></td>
</tr>
<tr><td>Email:</td>
    <td><input type="text" name="email"></td>
</tr>
<tr><td>Mobile:</td>
    <td><input type="text" name="mobile"></td>
</tr>
<tr><td><input type="submit" value="save"></td></tr>
</table>
</form>
${msg}
</body>
</html>