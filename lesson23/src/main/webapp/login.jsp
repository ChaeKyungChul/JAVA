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
    String username = (String) session.getAttribute("user");  
    String chara = request.getParameter("chara");
   %>
   <h1>반갑습니다. <%=username %>님,환영합니다.</h1>
   <p>한글변환 테스트 : <%=chara %>
</body>
</html>