<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  
  request.setAttribute("city", "김포시");
  session.setAttribute("nation", "대한민국");
  application.setAttribute("nation", "북조선인민공화국");

%>    
<jsp:forward page="Scope.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   \${true } : ${true} <br>
   \${120 } : ${120} <br>
   \${1.2e3} : ${1.2e3 }<br> 
   \${"EL문자열" } : ${"EL문자열" }<br>
   \${null } : ${null}<br>
   1000 + 30 = ${ 1000 + 30 }<br>
   100 / 5 = ${100 / 5 }<br>
   100을 6으로 나눈 나머지 = ${100 % 6 }<br>
   
</body>
</html>