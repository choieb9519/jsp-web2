<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s2" tagdir="/WEB-INF/tags/sample2" %>

<!DOCTYPE html>
<html>
<head>

<%@ include file="/WEB-INF/subModules/bootstrapHeader.jsp"%>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s2:navbar></s2:navbar>
<div class="container">
   <h1>로그인</h1>

   <form method="post" action="${pageContext.request.contextPath }/sample2/login">
   		id <br>
   		<input type="text" name="id"><br>
   		pw <br>
   		<input type="password" name="password"><br>
   		
   		<input type="submit" name="로그인"><br>
   </form>
   
	<c:if test= "${not empty message }" ></c:if>
   <div>
   		${message }
   </div>
   
</div>
</body>
</html>