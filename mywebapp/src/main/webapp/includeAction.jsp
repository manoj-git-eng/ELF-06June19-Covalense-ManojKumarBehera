<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Include Example!!!!!!!!!!!!</title>
</head>
<body>
11111111111111111
<br>
<jsp:include page="index.html"/>
<br>
2222222222222222222222222
<br>




<%-- <jsp:include page="currentDate"/> --%>     
<br>

333333333333333333333333
<br>
<%-- <jsp:include page="currentDate?fname=Manoj"/> --%>
<br>
44444444444444444444444444
<br>
<%-- <jsp:include page="currentDate"> --%>
<jsp:param value="Mamuni" name="fname"/>
<jsp:param value="Sabas" name="lname"/>
</jsp:include>
<br>
55555555555555555555555
<br>
<jsp:include page="MyFirstJSP.jsp"/>
<br>
666666666666666666666666666
<br>
<jsp:include page="TagsExample.jsp"/>

</body>
</html>