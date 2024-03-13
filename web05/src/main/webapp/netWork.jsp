<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>

 
  	  <ol>
  	        <li><label>프로토콜 정보 : </label> <%=request.getProtocol() %></li>
  	        <li><label>클라이언트 IP : </label> <%=request.getRemoteAddr() %></li>
  	        <li><label>서버 이름 : </label> <%=request.getServerName() %></li>
  	        <li><label>요청 방식 : </label> <%=request.getMethod() %></li>
  	        <li><label>URL 정보 : </label> <%=request.getRequestURL() %></li>
  	        <li><label>에플리케이션 정보 : </label> <%=request.getContextPath() %></li>
  	        <li><label>서블릿 정보 : </label> <%=request.getServletPath() %></li>
  	        
  	  </ol>

  	
  	
</body>
</html>
