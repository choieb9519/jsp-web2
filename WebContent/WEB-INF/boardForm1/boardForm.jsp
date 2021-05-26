<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>

<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>

<%@ include file="/WEB-INF/subModules/bootstrapHeader.jsp"%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
   <form action="" method="post">
   		제목
   		<br>
   		<input type="text" name="title" />
   		<br>
   		본문
   		<br>
   		<textarea name="body"></textarea>
   		<br>
   		<input type="submit" />
   </form>
</div>
</body>
</html>