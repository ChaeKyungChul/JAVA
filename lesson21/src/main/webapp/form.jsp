<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="param.jsp" method="post">
  이름 : <input type="text" name="username" /> <br><br>
  메일 : <input type="text" name="usereamil" /> <br><br>
  <p>취미 (관심분야) : 하나 이상 선택하세요</p>
  <input type="checkbox" name="hobby" value="게임"/> 게임 &nbsp;&nbsp;&nbsp;
  <input type="checkbox" name="hobby" value="영화"/> 영화 &nbsp;&nbsp;&nbsp;
  <input type="checkbox" name="hobby" value="독서"/> 독서 &nbsp;&nbsp;&nbsp;
  <input type="checkbox" name="hobby" value="잠"/> 잠 &nbsp;&nbsp;&nbsp;
   <br><br>
   <input type="submit" value="
   						확인
   						"/> 
 
</form>  
</body>
</html>