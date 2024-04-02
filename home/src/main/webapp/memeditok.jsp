<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%@ page import="java.sql.*, jspBoard.dao.MembersDao" %> 
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="db" class="jspBoard.dao.DBConnect" scope="page"/>
<jsp:useBean id="mDto" class="jspBoard.dto.MDto" scope="page" />
<jsp:setProperty name="mDto" property="*" /> 

<%   
   Connection conn = db.getConnection();
   MembersDao dao = new MembersDao(conn);
   int rs = dao.updateDB(mDto);
   String userid = mDto.getUserid();

%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정결과</title>

<script>
  alert("정보가 수정되었습니다.");
  location.href="./index.jsp";
</script>

</head>
<body>
<h1>데이터가 성공적으로 등록 되었습니다.</h1>
</body>
</html>