<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 //HttpSession session = request.getSession();
 session.invalidate();

%>
<a href="mysession.jsp">세션확인</a>
</body>
</html>