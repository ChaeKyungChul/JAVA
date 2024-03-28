<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="xml" uri="http://java.sun.com/jsp/jstl/xml" %>
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
<h1>1. 수식계산하기</h1>
 <ol> 
 <li>2 + 5 = ${2 + 5}</li>
 <li>2 / 5 = ${2 / 5}</li>
 <li>2 < 5 = ${2 < 5 }</li>
 </ol>
 
  <c:if test="${!empty param.name }">
   	이름  : ${param.name} 
   	</c:if>
 
 
 <h1>2.웹 브라우저 정보얻기</h1>
 <ol>
    <li>웹브라우정보 (user-agent) => ${header["user-agent"]}</li>
    <li>컴퓨터 host (host) => ${headr["host"]}</li>
 </ol>
 <h1>3. request</h1>
    <ol>
    <li> http 메소드 => ${pageContext.request.method}</li>
    <li> 파라미터값 얻기 => ${param["name"]}</li>
    <li> 파라미터값이 공백 => ${empty param["name"]}
    </ol>
  <h1>4.쿠키 값</h1>
    <ol>
    <li> 세션 id : ${cookie["JESSIONID"].value }
    
    </ol> 
   


</body>
</html>