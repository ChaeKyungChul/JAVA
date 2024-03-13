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

	//속성 추출
	String spring = (String) pageContext.getAttribute("spring");  //널 , 해당페이만 갖고있음
	String summer = (String) request.getAttribute("summer");  //널, 다른페이지에서 넘겨받은객체
	String fall = (String) session.getAttribute("fall");  // 출력   ㅡ> setatter 끊어지면 널, 세션이 살아있는동안 실행
	String winter = (String) application.getAttribute("winter");//출력ㅡ> setatter 끊어지면 널 , 톰켓이 켜져있는 동안 실행
%>
 
  <ol>
  	<li>pageContext : <%=spring %></li>
    <li>request : <%=summer %> </li>
  	<li>session : <%=fall %></li>
  	<li>application : <%=winter %></li>
  
  </ol>
  <!--//아래 2개만 출력됨-->

</body>
</html>