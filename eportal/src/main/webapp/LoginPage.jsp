<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<% String msg=(String) request.getAttribute("msg"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./loginNew">
		User ID:<input type="text" placeholder="User name" style="width: 258px; "><br>
		Password:<input type="password" placeholder="Password" required style="width: 248px; ">
		<br><br>
		<input type="reset" value="Reset" style="width: 144px; ">&nbsp;&nbsp;
		<input type="submit" value="Login" style="width: 155px; ">


	</form>

</body>
</html>