<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%request.setCharacterEncoding("utf-8"); %>
 <jsp:useBean id="dto" class="com.ExpDto.ExpDto" scope="request" />
 <jsp:setProperty name="dto" property="*" />
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   body{
   background:#ededed;  
   }
   
 .box{
 background:#fff;
  width:600px;
  margin-left:auto;
  margin-right:auto;
  padding:40px;
  border:1px solid #ddd;
  margin-top:40px;
 }
 .box ul{
  list-style-type:none;
  margin:0;
  padding:0;
  }
  
  label{
  display:inline-block;
  padding-right:15px;
  width:100px;
  text-align:center;
  
  }
  
  li{
  
  line-height:40px;
  border-bottom:1px dashe #ededed;
  }
  
	.text-center{
	 text-align:center;
	}
	
	
</style>
</head>
<body>
   <h1>Dto 추출</h1>
   <div class="box">
   <ul>
   	<li><label>아이디</label>
   		<%=dto.getUserid() %>
   	</li>
    <li><label>비밀번호</label>
   		<%=dto.getUserpass() %>
   	</li>
   	<li><label>이메일</label>
   		<%=dto.getUseremail() %>
   	</li>
   	<li><label>주소</label>
   		<%=dto.getAddress() %>
   	</li>
   	<li><label>성별</label>
   		<%=dto.getSex() %>
   	</li>
   </div>   
   
   <h1 calss="text-center"> 액션 태그로 추출</h1>
     <div class="box">
   <ul>
   	<li><label>아이디</label>
   		<jsp:getProperty property="userid" name="dto" />
   	</li>
    <li><label>비밀번호</label>
   		<jsp:getProperty property="userpass" name="dto" />
   	</li>
   	<li><label>이메일</label>
   		<jsp:getProperty property="usereamil" name="dto" />
   	</li>
   	<li><label>주소</label>
   		<jsp:getProperty property="address" name="dto" />
   	</li>
   	<li><label>성별</label>
   		<jsp:getProperty property="sex" name="dto" />
   	</li>
   </div>  
   
   
   <h1 calss="text-center"> EL 태그로 추출</h1>
     <div class="box">
   <ul>
   	<li><label>아이디</label>
   		${dto.userid }
   	</li>
    <li><label>비밀번호</label>
   		${dto.userpass }
   	</li>
   	<li><label>이메일</label>
   		${dto.usereamil }
   	</li>
   	<li><label>주소</label>
   		${dto.address }
   	</li>
   	<li><label>성별</label>
   		${dto.sex }
   	</li>
   </div> 
 

</body>
</html>
</body>
</html>





<%-- 2024-03-19 java lesson21

1. ExpDto.class
아이디, 비밀벊, 이메일, 주소 , 성별  변수를 만들고
게터, 세터를 만드세요.

2. myform.jsp
 아이디, 비밀번호 , 이메일 , 주소 , 성별 입력창을 만든후 
myformok.jsp파일로 전송

3.myformok 에서 user빈을 통해서 requset를 dto로 보내고 
  dto에서 받은 값을 el액션 태그를 이용해서 출력하세요.   

  el 태그 : 객체 이름.getuser  
  <%=객체이름.getUsername()%>
  {객체이름.username}
 <jsp:getProperty property="userMail" name="객체이름" /> --%>
