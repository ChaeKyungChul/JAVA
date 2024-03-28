<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl.core"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl.fmt"%>   
<fmt:requestEncoding value="utf-8" />    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단</h1>
<%--
   int t = Integer.ParaseInt(request.getParameter("t"));  <<아래랑같음
   request.setAttribute(t,ts);         <<위랑같음 
 --%>	
 <c:set var="t" value="${param.t}" />
 <c:if test="${empty t }">
    <c:set var="t" value="8" />
 </c:if>
 <!-- 시작값을 begin, 끝값을 end , 증가값을 step로 설정할수 있다. -->
 <c:forEach var="a" begin="1" end="9" step="1">
     <c:out value="${t}" /> X <c:out value="${a}" /> =
     <c:out value="${a * t}" /><br>
     ${t} X ${a} = ${a * t}<br><br>
 </c:forEach> 

</body>
</html>