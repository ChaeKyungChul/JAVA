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
		//속성세팅
	pageContext.setAttribute("spring", "봄");  //출력
	request.setAttribute("summer", "여름");  //출력
	session.setAttribute("fall", "가을");  // 추ㅜㄹ력
	application.setAttribute("winter", "겨울");  //출력

	//4개다 출력됨
	//속성 추출
	String spring = (String) pageContext.getAttribute("spring");
	String summer = (String) request.getAttribute("summer");
	String fall = (String) session.getAttribute("fall");
	String winter = (String) application.getAttribute("winter");	
%>
 
  <ol>
  	<li>pageContext : <%=spring %></li>
    <li>request : <%=summer %> </li>
  	<li>session : <%=fall %></li>
  	<li>application : <%=winter %></li>
  <!--//4개다 출력됨-->
  </ol>

</body>
</html>