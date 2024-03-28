<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="lesson24.TestClass"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = "내 웹페이지 입니다.";
	String content = "나는 나의 웹 페이지를 무지하기 사랑합니다.";	
	
	TestClass ts = new TestClass();
	ts.setMyname(); // 홍길동으로 myname 필드가 초기화
	String uname = ts.getMyname(); //필드값을 읽어옴
	
	String skin = "inc/view.jsp";
	
	request.setAttribute("ts" , ts);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1><%=uname %></h1>
   <jsp:include page="<%=skin%>" >
      <jsp:param value="<%=name %>" name="name"/>
      <jsp:param value="<%=content %>" name="content"/>
   </jsp:include>
</body>
</html>