<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="UTF-8" />
	<title>login</title>
</head>
<body>


	<form action="loginservice" method="post"> 
	   <label for="username">이름</label>
	   <input type="text" id="username" name="username" />
	   <br>
	   <label for="password">비밀번호</label>
	   <input type="password" id="password" name="password" />
	   <br>
	   <button type="reset">취소</button>
	   <button type="submit">전송</button> 
	</form>
</body>
</html>