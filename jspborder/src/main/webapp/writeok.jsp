<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%@ page import="java.sql.*, jspBoard.dto.BDto" %> 
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="db" class="jspBoard.dao.DBConnect" scope="page"/>
<jsp:useBean id="bDto" class="jspBoard.dto.BDto" scope="page" />
<jsp:setProperty name="bDto" property="*" /> 
<%
   Connection conn = db.conn;
   String sql =" insert into jboard (title, content, writer, pass)"
             + "values (?, ?, ?, ?)";
   PreparedStatement pstmt = conn.prepareStatement(sql);
   pstmt.setString(1, bDto.getTitle());
   pstmt.setString(2, bDto.getContent());
   pstmt.setString(3, bDto.getWriter());
   pstmt.setString(4, bDto.getPass());
   pstmt.executeUpdate();
   pstmt.close();
   conn.close();
%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>데이터가 성공적으로 등록 되었습니다.</h1>
</body>
</html>