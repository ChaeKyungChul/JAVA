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
  out.println(request.getAttribute("city"));
 
 %>
  <br>
  <br>
  1. ${city} <br><br>
  2. ${nation}<br><br>
  3. ${application }<br><br>
</body>
</html>