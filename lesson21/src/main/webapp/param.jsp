<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <p> 이름 : ${param.username } </p>
 <p> 이메일 : <%=request.getParameter("usereamil") %>
 <p> 취미(관심분야) : </p>
  ${paramValues.hobby[0]} 
   ${paramValues.hobby[1]} 
    ${paramValues.hobby[2]}  
     ${paramValues.hobby[3]}  

</body>
</html>