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
	JspWriter out2 = pageContext.getOut();
	out.print(out2 == out);
	
	pageContext.forward("form.jsp");   //  페이지 주소 그대로
  //  response.sendRedirect("form.jsp");  //페이지 주소도 명이동
	
%>
</body>
</html>