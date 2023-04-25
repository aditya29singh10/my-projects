<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="DrakRed">
<h1>jai mahakal baba</h1>
<h2>help me baba</h2>

<%
String name =(String)request.getAttribute("name");
Integer rollnumber=(Integer)request.getAttribute("rollnumber");


%>

<h1>
						hello this my name 
<%= name %>

</h1>
<h1>
						hello this my roll number 
<%= rollnumber %>

</h1>
</body>
</html>