<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags/ch16/lecture %>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags/ch16/textbook %>

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
   <!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal01">
  		Launch demo modal
	</button>
	
	<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal02">
  		Launch demo modal
	</button>
</div>

<my:modal02 id="exampleModal01" keyboard="ture" />
<!-- true가 아니면 모든 문자열을 false로 인식함, 컴파일 오류 안나니까 오타 조심 -->
<my:modal02 id="exampleModal02" keyboard="false" />

</body>
</html>