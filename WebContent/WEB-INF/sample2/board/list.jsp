<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s2" tagdir="/WEB-INF/tags/sample2"%>


<!DOCTYPE html>
<html>
<head>

<%@ include file="/WEB-INF/subModules/bootstrapHeader.jsp" %>

<title>Insert title here</title>
</head>
<body>
<s2:navbar></s2:navbar>
<div class="container">
<<<<<<< HEAD
	<h1>글 목록<small class="text-muted">[${totalNum }]</small></h1>
	<s2:message></s2:message>
=======
	<h1>글 목록</h1>
	
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45
	<table class="table">
		<thead>
			<tr>
				<th>#</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성시간</th>
			</tr>
		</thead>
	
		<tbody>
			<c:forEach items="${boards }" var="board">
				<tr>
					<td>${board.boardId }</td>
					<td>
<<<<<<< HEAD
						<a href="<%= request.getContextPath() %>/sample2/board/detail?id=${board.boardId}">
							${board.title }
						</a>
						
						<c:if test="${board.numberOfComment != 0 }">
						 <span>[${board.numberOfComment }]</span>
						</c:if> 
=======
						<a href="<%= request.getContextPath() %>/sample2/board/detail?id=${board.id}">
							${board.title }
						</a>
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45
					</td>
					<td>${board.memberName }</td>
					<td>${board.timeAgo }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<<<<<<< HEAD

</body>
</html>
=======
</body>
</html>








>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45
