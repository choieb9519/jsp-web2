<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>request 객체<!-- html --></h1>
<%
//java
	System.out.println(request);
				     //request객체 사용 가능, 파라미터로 받음
	out.print(request.getHeader("Host"));
%>
<br>
<%= request.getHeader("Connection") %>
<br>
<p>요청방식</p>
<%= request.getMethod() %>

<p>요청 url</p>
<%= request.getRequestURI() %>

</body>
</html>