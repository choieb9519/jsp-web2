<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String memberid = (String)session.getAttribute("MEMBERID");
   		boolean login = memberid == null ? false : true;
    %>
<!DOCTYPE html>
<html>
<head><title>로그인 여부 검사</title>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	if (login) {	
%>
아이디 "<%= memberid %>"로 로그인 한 상태
<%
	} else {
%>
로그인 하지 않은 상태
<%
	}
%>

</body>
</html>