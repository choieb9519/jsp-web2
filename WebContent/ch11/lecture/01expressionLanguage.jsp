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
   <h1>Expression Language (EL) - 표현언어</h1>
   <h3>문법</h3>
   <p>%{변수명 }</p>
   <p>${var }</p>
   <p>var: 네 개 영역의 attribute(속성) page, request, session, application</p>
   <p>page 영역 부터 request, session, application 영역 순으로 찾음</p>
   <p>없으면 출력하지 않음</p>
   
</div>
</body>
</html>