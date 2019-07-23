<%!public String name = "Rajni kant";
	private int age = 70;

	{
		System.out.println("Inside my block");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getName(String name) {
		return "Given name is:- " + name;
	}%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration tag example...!!!</title>
</head>
<body>
	<span style="color: pink"><h1>JSP tags example...!!!</h1></span>
	<br>
	<br>
	Name1 : <%=name %><br>
	Name2 : <%=getName() %><br>
	Name3 : <%=getName("Manoj") %><br>
	Age1 : <%=age %><br>
	Age2 : <%=getAge() %><br>
	<br><br>
	<% for(int i=0;i<5;i++){
		%>
		Name1 : <%=name %><br>
		<%
	}
		%>

	
	

</body>
</html>