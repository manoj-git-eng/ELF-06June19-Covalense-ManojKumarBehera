<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%int userId=(Integer)request.getAttribute("userId");
String password=(String)request.getAttribute("password");

%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<br><br><br><br><br><br><br>
<table>
<tr>
<td>

User ID=<%=userId %>
<br>
Password=<%=password %>




</td>
</table>
</center>




</body>
</html>