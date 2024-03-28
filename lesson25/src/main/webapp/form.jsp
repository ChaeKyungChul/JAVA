<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl.core" %>    
<%
 request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Q. 지금 계신분의 이름을 철수이지요. 당신의 이름은 무엇인가요? </p>
	   저의 이름은 ${param.uname }
	<p>Q. 철수의 나이는 20세 입니다. 당신은 철수보다 나이가 얼마나 더 많은가요? </p>
		저는 철수보다 ${20 - param.age } 더 많아요.
	<p>Q. 당신의 이메일 주소는 어덯게 되나요?
		${param.email }
		
  <h3>헤더 정보 뽑기 </h3>		
	<ol>
	<c:forEach var="he" items="${header }">
	<li><c:out value="${he.key }" /> : ${he.value }</li>
	</c:forEach>
	</ol>
</body>
</html>